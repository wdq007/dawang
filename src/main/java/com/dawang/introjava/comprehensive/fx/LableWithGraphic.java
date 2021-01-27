package com.dawang.introjava.comprehensive.fx;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Page 544
 * 程序清单 16-1
 *
 */
public class LableWithGraphic  extends Application {
    @Override
    public void start(Stage primaryStage){
        ImageView cn = new ImageView(new Image("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=91557552,23270224&fm=26&gp=0.jpg",100,80,true,true));
        Label lbl = new Label("China\n Five Stars Red Flag",cn);
        lbl.setStyle("-fx-border-color:lightgray; -fx-border-width:2");
        lbl.setContentDisplay(ContentDisplay.BOTTOM);//图像放置在文本的底部
        lbl.setTextFill(Color.RED);

        Label lbl2 = new Label("Circle",new Circle(50,50,25));
        lbl2.setTextFill(Color.ORANGE);
        lbl2.setContentDisplay(ContentDisplay.TOP);//圆被放在文本的上方

        Label lbl3 = new Label("Rectangle", new Rectangle(10,10,50,25));
        lbl3.setContentDisplay(ContentDisplay.RIGHT);//矩形位于文本的右侧

        Label lbl4 = new Label("Ellipse", new Ellipse(50,50,50,25));
        //lbl4.setTextFill(Color.GREEN);
        lbl4.setContentDisplay(ContentDisplay.LEFT);

        Ellipse ellipse = new Ellipse(50,50,50,25);
        ellipse.setFill(Color.WHITE);
        ellipse.setStroke(Color.GREEN);
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(ellipse, new Label("JavaFX"));

        Label lbl5 = new Label("A Pane inside a Label",stackPane);
        lbl5.setContentDisplay(ContentDisplay.BOTTOM);

        HBox hBox = new HBox(20);
        hBox.getChildren().addAll(lbl,lbl2,lbl3,lbl4,lbl5);

        Scene scene = new Scene(hBox,700,200);
        primaryStage.setTitle("LabelWithGraphic");
        primaryStage.setScene(scene);
        primaryStage.show();





    }
}
