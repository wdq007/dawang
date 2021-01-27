package com.dawang.introjava.comprehensive;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Page 36
 * 程序清单20-6 一个显示弹球的程序。修改了程序清单15-12
 * 可以使用两个按钮来暂停和恢复球的移动。
 * 一个滚动条来控制球速。
 * 以及"+"和"-"按钮来添加和删除一个球
 */

//该类放置控制组建并且实现控制
public class MultipleBounceBall extends Application {

    @Override
    public void start(Stage primaryStage) {

        MultipleBallPane ballPane = new MultipleBallPane();
        ballPane.setStyle("-fx-border-color:yellow");

        Button btAdd = new Button("+");
        Button btSubstract = new Button("-");
        HBox  hBox = new HBox(10);
        hBox.getChildren().addAll(btAdd,btSubstract);
        hBox.setAlignment(Pos.CENTER);

        btAdd.setOnAction(e -> ballPane.add()); //单击"+"按钮的时候，一个新的球被加入到面板
        btSubstract.setOnAction(e -> ballPane.substract()); //单击"-"按钮的时候，数组列表的最后一个球被移除。

        ballPane.setOnMousePressed(e -> ballPane.pause());

        ballPane.setOnMouseReleased(e -> ballPane.play());

        ScrollBar sbSpeed = new ScrollBar();
        sbSpeed.setMax(20);
        sbSpeed.setValue(10);
        ballPane.rateProperty().bind(sbSpeed.valueProperty());
        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setTop(sbSpeed);
        pane.setBottom(hBox);

        Scene scene = new Scene(pane,250,150);
        primaryStage.setTitle("MultipleBoundBall");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    //该类负责显示球
    private class MultipleBallPane extends Pane {
        private Timeline animation;

        public MultipleBallPane() {
            animation = new Timeline(
                    new KeyFrame(Duration.millis(50), e -> moveBall())

            );
            animation.setCycleCount(Timeline.INDEFINITE);
            animation.play();
        }

        //用一个随机颜色新建一个球，并加入面板
        public void add() {
            Color color = new Color(Math.random(), Math.random(), Math.random(), 0.5);
            //每个球的半径具有10和20之前的随机值
            //每个球有它的状态，x坐标，y坐标，颜色以及移动方向。当球被创建时候，它从左上角开始向右下移动。
            //一个随机的颜色被赋给新球
            getChildren().add(new Ball(30, 30, 10+Math.random()*10, color));
            //getChildren().add(new Ball(30, 30, 20, color));


        }
        //面板将所有的球存储在一个列表， substract移除最后一个球
        public void substract(){
            //pane的getChildren方法返回一个List<Node>的子类ObervableList<Node>用于存储面板的节点。
            //该线性表初始为空。当创建一个新的球时，将其添加到线性表的末尾。
            //要移除一个球，只需简单地将线性表的最后一个移除

            if(getChildren().size()> 0){
                 //当按钮被单击时候，移除列表中的第一个球
                getChildren().remove(0);
                //getChildren().remove(getChildren().size() -1);
            }
        }


        public void play(){
            animation.play();
        }

        public void pause(){
            animation.pause();
        }

        public void increaseSpeed(){
            animation.setRate(animation.getRate() + 0.1);
        }

        public void decreaseSpeed(){
            animation.setRate(
                    animation.getRate()> 0? - 0.1 : 0
            );
        }

        public DoubleProperty rateProperty(){
            return  animation.rateProperty();
        }

        //得到面板中列表里的每个球，并调整球的位置
        protected void moveBall() {

            for(Node node:this.getChildren()){
                Ball ball= (Ball) node;
                if(ball.getCenterX() < ball.getRadius() || ball.getCenterX() > getWidth() - ball.getRadius()){
                    ball.dx *= -1;

                }

                if(ball.getCenterY() < ball.getRadius()||ball.getCenterY()> getHeight() - ball.getRadius()){
                    ball.dy *= -1;
                }

                ball.setCenterX(ball.dx+ball.getCenterX());
                ball.setCenterY(ball.dy+ball.getCenterY());
            }

        }


    }


    class Ball extends Circle {
        private double dy = 1, dx = 1;


        Ball(double x, double y, double radius, Color color) {
            super(x, y, radius);
            setFill(color);
        }
    }


}