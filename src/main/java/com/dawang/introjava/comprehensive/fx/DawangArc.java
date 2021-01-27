package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DawangArc extends Application {
    @Override
    public void start(Stage primaryStage){

        Pane pane = new Pane();

        Arc r1 = new Arc(150,100,80,80,30,50);
        r1.setFill(Color.RED);
        r1.setType(ArcType.ROUND);
        pane.getChildren().addAll(new Text(210,40,"arc1:round"),r1);

        Arc r2 = new Arc(150,100,80,80,30+90,50);
        r2.setFill(Color.WHITE);
        r2.setType(ArcType.OPEN);
        r2.setStroke(Color.BLACK);
        pane.getChildren().addAll(new Text(20,40,"arc2:open"),r2);

        Arc r3 = new Arc(150,100,80,80,30+180,50);
        r3.setFill(Color.GREEN);
        r3.setType(ArcType.CHORD);
        r3.setStroke(Color.BLUE);
        pane.getChildren().addAll(new Text(20,170,"arc3:chord"),r3);

        Arc r4 = new Arc(150,100,80,80,30+270,50);
        r4.setFill(Color.YELLOW);
        r4.setType(ArcType.CHORD);
        r4.setStroke(Color.BLACK);
        pane.getChildren().addAll(new Text(210,170,"arc4:chord"),r4);

        Scene scene = new Scene(pane,300,300);
        primaryStage.setTitle("DawangArc");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

}
