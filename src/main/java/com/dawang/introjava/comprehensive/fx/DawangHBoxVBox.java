package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DawangHBoxVBox extends Application {
    @Override
    public void start(Stage primaryStage){
        BorderPane pane = new BorderPane();
        pane.setTop(getHBox());
        pane.setLeft(getVBox());

        Scene scene = new Scene(pane);
        primaryStage.setTitle("DawangHBoxVBox");
        primaryStage.setScene(scene);
        primaryStage.show();



    }

    private VBox getVBox(){
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15,5,5,5));
        vBox.getChildren().add(new Label("Courses"));
        Label[] courses = {new Label("CS 13"), new Label("CS 12"),new Label("CS 15"), new Label("CS 16")};

        for(Label l:courses){
            vBox.setMargin(l,new Insets(0,0,0,15));
            vBox.getChildren().add(l);
        }
        return vBox;

    }

    private HBox getHBox(){
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15,15,15,15));
        hBox.setStyle("-fx-background-color:green");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
        hBox.getChildren().add(new ImageView(new Image("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2077947143,2646761393&fm=26&gp=0.jpg")));
        return hBox;
    }
}
