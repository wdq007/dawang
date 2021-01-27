package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DawangText extends Application {
    @Override
    public void start(Stage primaryStage){

        Pane pane = new Pane();
        pane.setPadding(new Insets(5,5,5,5));

        Text t1 = new Text(20,20,"Dawang is fun");
        t1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC,15));
        pane.getChildren().add(t1);

        Text t2 = new Text(60,60,"Dawang is fun\nDisplay text");
        pane.getChildren().add(t2);

        Text t3 = new Text(10,100,"Dawang is fun\nDisplay text");
        t3.setFill(Color.RED);
        t3.setUnderline(true);
        t3.setStrikethrough(true);
        pane.getChildren().add(t3);

        Scene scene = new Scene(pane,200,250);
        primaryStage.setTitle("DawangText");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
