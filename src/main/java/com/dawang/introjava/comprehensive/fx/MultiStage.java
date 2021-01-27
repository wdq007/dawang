package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultiStage extends Application {
    @Override
    public void start(Stage primaryStage){
        Scene scene = new Scene(new Button("Ok"),200,250);
        primaryStage.setTitle("MultiStage");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New Stage"),100,100));
        stage.show();
    }
}
