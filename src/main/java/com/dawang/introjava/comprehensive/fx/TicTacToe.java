package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;



/**
 *  Page 569
 *  程序清单 16-13
 *
 */

public class TicTacToe extends Application {
    //whoseTurn用来跟踪下一个要放在单元格中的标记的类型。
    private char whoseTurn = 'X';
    private Cell[][] cell = new Cell[3][3];
    //命名为 lblStatus的标签用来显示游戏的状态
    private Label lblStatus = new Label("X's turn to play");


    @Override
    public void start(Stage primaryStage){
        //将9个单元格放置在一个网格面板上来初始化用户界面
        GridPane pane = new GridPane();
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                pane.add(cell[i][j] = new Cell(),j,i);
            }
        }

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(lblStatus);
        Scene scene = new Scene(borderPane,450,300);
        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public boolean isFull(){
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                if(cell[i][j].getToken() == ' '){
                    return false;

                }

            }
        }
        return true;
    }

    public boolean isWon(char token){


        for(int i=0;i<3;i++){
            if(cell[i][0].getToken() == token
            && cell[i][1].getToken() == token
            && cell[i][2].getToken() == token){
                return true;
            }
        }

        for(int j=0;j<3;j++){
            if(cell[0][j].getToken() == token
            && cell[1][j].getToken() == token
            && cell[2][j].getToken() == token){
                return  true;
            }
        }

        if(cell[0][0].getToken() == token
        && cell[1][1].getToken() == token
        && cell[2][2].getToken() == token){
            return true;
        }


        if(cell[0][2].getToken() == token
        && cell[1][1].getToken() == token
        && cell[2][0].getToken() == token){
            return  true;
        }

    return  false;
    }
    // Cell 类是 TicTacToe 类中的内部类
    public class Cell extends Pane {
        private char token = ' ';

    public Cell(){
        setStyle("-fx-border-color:blue");
        setPrefSize(2000,2000);
        this.setOnMouseClicked(e->handleMouseClick());

    }

    public char getToken(){
        return this.token;
    }

    public void setToken(char token) {
        this.token = token;

        if (this.token == 'X') {
            Line line1 = new Line(10, 10, this.getWidth() - 10, this.getHeight() - 10);

            line1.endXProperty().bind(this.widthProperty().subtract(10));
            line1.endYProperty().bind(this.heightProperty().subtract(10));

            Line line2 = new Line(10, this.getHeight() - 10, this.getWidth() - 10, 10);
            line2.startYProperty().bind(this.heightProperty().subtract(10));
            line2.endXProperty().bind(this.widthProperty().subtract(10));

            this.getChildren().addAll(line1, line2);
        } else if (this.token == 'O') {
            Ellipse ellipse = new Ellipse(this.getWidth() / 2, this.getHeight() / 2, this.getWidth() / 2 - 10, this.getHeight() / 2 - 10);
            ellipse.centerXProperty().bind(this.widthProperty().divide(2));
            ellipse.centerYProperty().bind(this.heightProperty().divide(2));
            ellipse.radiusXProperty().bind(this.widthProperty().divide(2).subtract(10));
            ellipse.radiusYProperty().bind(this.heightProperty().divide(2).subtract(10));
            ellipse.setStroke(Color.BLACK);
            ellipse.setFill(Color.GREEN);
            getChildren().add(ellipse);

        }
    }
        //为单元格注册用于监听鼠标单击动作的监听器
        private void handleMouseClick(){
            if(token == ' ' && whoseTurn != ' '){ //如果游戏没有结束时单击空单元格，那么在单元格中会设置一个标记
                setToken(whoseTurn);

                if (isWon(whoseTurn)){
                    lblStatus.setText(whoseTurn+" won! The game is over");
                    whoseTurn = ' ';//如果游戏结束，whoseTurn 设置为 (空)
                }else if(isFull()){
                    lblStatus.setText("Draw! The game is over");
                    whoseTurn = ' ';//如果游戏结束，whoseTurn 设置为 (空)

                }else {
                    whoseTurn = (whoseTurn == 'X' ? 'O':'X');
                    lblStatus.setText(whoseTurn+"'s turn");//WhoseTurn 被轮流设置为新的下棋方
                }
            }
        }

    }





}
