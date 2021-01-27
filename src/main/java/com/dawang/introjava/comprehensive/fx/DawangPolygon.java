package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class DawangPolygon extends Application {
    @Override
    public void start(Stage primaryStage){

        Pane pane = new Pane();
        Polygon polygon = new Polygon();
        polygon.setStroke(Color.RED);
        //polygon.setFill(Color.GREEN);
        //polygon.setFill(null);
        polygon.setFill(Color.color(Math.random(),Math.random(),Math.random()));
        pane.getChildren().add(polygon);
        ObservableList<Double> list = polygon.getPoints();

        final  double  WIDTH = 200, HEIGHT = 200;
        double centerX = WIDTH/2, centerY = HEIGHT/2;
        double radius = Math.min(WIDTH,HEIGHT) *0.4;

        for(int i=0;i<6;i++){

            list.add(centerX+radius*Math.cos(2*i*Math.PI/6));
            list.add(centerY-radius*Math.sin(2*i*Math.PI/6));

        }

        Scene scene = new Scene(pane,WIDTH,HEIGHT);
        primaryStage.setTitle("DawangPolygon");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
