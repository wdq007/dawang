package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DawangRectangle extends Application {

    @Override
    public void start(Stage primaryStage){

        Pane pane = new Pane();

        Rectangle r1 = new Rectangle(25,10,60,30);
        r1.setStroke(Color.RED);
        r1.setFill(Color.WHITE);
        pane.getChildren().addAll(new Text(10,27,"r1"),r1);

        Rectangle r2 = new Rectangle(25,50,60,30);
        pane.getChildren().addAll(new Text(10,67,"r2"),r2);

        Rectangle  r3 = new Rectangle(25,90,60,30);
        r3.setArcHeight(25);
        r3.setArcWidth(15);
        pane.getChildren().addAll(new Text(10,107,"r3"),r3);

        for(int i=0;i<4;i++){
            Rectangle r = new Rectangle(100,50,100,30);
            r.setRotate(i*360/8);
            r.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
            //r.setFill(Color.WHITE);
            r.setFill(null);
            pane.getChildren().add(r);
        }

        Scene scene = new Scene(pane,300,300);
        primaryStage.setTitle("DawangRectangle");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
