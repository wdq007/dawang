package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class DawangFont extends Application {

    @Override
    public void start(Stage primaryStage){


        StackPane pane = new StackPane();

        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setStroke(Color.BLUE);
        circle.setFill(new Color(0.2,0.3,0.4,0.5));

        Label label = new Label("DawangFont");

        label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,FontPosture.ITALIC,20));


        pane.getChildren().addAll(circle,label);
        Scene scene = new Scene(pane,250,200);
        primaryStage.setTitle("DawangFont");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
