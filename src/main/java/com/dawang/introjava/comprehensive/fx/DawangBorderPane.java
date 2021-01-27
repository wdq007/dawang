package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DawangBorderPane extends Application {
    @Override
    public void start(Stage primaryStage){
        BorderPane pane = new BorderPane();
        pane.setTop(new CustomPane("Top"));
        pane.setBottom(new CustomPane("Bottom"));
        pane.setLeft(new CustomPane("Left"));
        pane.setRight(new CustomPane("Right"));
        pane.setCenter(new CustomPane("Center"));

        Scene scene = new Scene(pane,200,250);
        primaryStage.setTitle("DawangBorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

}
class CustomPane extends StackPane {

    public CustomPane(String txt){
        getChildren().add(new Label(txt));
        setStyle("-fx-border-color:cyan");
        setPadding(new Insets(11.5,12.5,13.5,14.5));
    }
}
