package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DawangLine extends Application {
    @Override
    public void start(Stage primaryStage){
        Scene scene = new Scene(new LinePane(),300,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("DawangLine");
        primaryStage.show();


    }


}
class LinePane extends Pane {

    public LinePane(){
        Line l1 = new Line(10,10,10,10);
        l1.endXProperty().bind(widthProperty().subtract(10));
        l1.endYProperty().bind(heightProperty().subtract(10));
        l1.setStroke(Color.GREEN);
        l1.setStrokeWidth(5);
        getChildren().add(l1);

        Line l2  = new Line(10,10,10,10);
        l2.startXProperty().bind(widthProperty().subtract(10));
        l2.endYProperty().bind(heightProperty().subtract(10));
        l2.setStrokeWidth(10);
        l2.setStroke(Color.GREEN);
        getChildren().add(l2);

    }

}