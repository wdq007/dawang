package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class RotateNode extends Application {

    @Override
    public void start(Stage primaryStage){

        StackPane pane = new StackPane();

        Button button = new Button("Ok");

        button.setStyle("-fx-border-color:red;");

        pane.getChildren().addAll(button);

        pane.setRotate(45);

        pane.setStyle("-fx-border-color:blue;-fx-background-color:lightgray");

        Scene scene = new Scene(pane,350,200);
        primaryStage.setTitle("Rotate Node");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
