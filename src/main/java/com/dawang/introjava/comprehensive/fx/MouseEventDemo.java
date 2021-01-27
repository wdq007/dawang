package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 程序清单15-7 你可以通过拖动鼠标 来移动消息
 */
public class MouseEventDemo extends Application {

    @Override
    public void start(Stage primaryStage){

        Pane pane = new Pane();
        Text text = new Text(20,20,"Programming is fun");
        pane.getChildren().addAll(text);

        text.setOnMouseDragged(e->{
            text.setX(e.getX());
            text.setY(e.getY());
        });

        Scene scene = new Scene(pane,300,300);
        primaryStage.setTitle("MouseEventDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

