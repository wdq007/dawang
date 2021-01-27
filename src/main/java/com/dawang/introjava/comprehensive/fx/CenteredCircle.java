package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CenteredCircle extends Application {
    @Override
    public void start(Stage primaryStage){

        Pane pane = new Pane();
        Circle circle = new Circle();
        //circle.setCenterX(100);
        //circle.setCenterY(100);
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.RED);
        circle.setFill(Color.BLUE);

        pane.getChildren().add(circle);



        Scene scene = new Scene(pane,200,200);

        primaryStage.setTitle("Centered Circle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
