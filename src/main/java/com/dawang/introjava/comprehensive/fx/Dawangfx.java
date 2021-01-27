package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Dawangfx extends Application {
    @Override
    public void start(Stage primaryStage){
        Button bt = new Button("Ok");
        Scene scene = new Scene(bt,200,250);
        primaryStage.setTitle("Dawangfx");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
