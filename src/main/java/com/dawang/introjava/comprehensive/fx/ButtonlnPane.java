package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonlnPane extends Application {
    @Override
    public void start(Stage primaryStage){
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("Ok"));
        Scene scene = new Scene(pane,200,50);

        primaryStage.setTitle("ButtonInPane");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
