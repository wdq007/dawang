package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DawangControlCircle  extends Application {

    private CirclePane circlePane = new CirclePane();
    @Override
    public void start(Stage primaryStage){


        /*
        StackPane stackPane = new StackPane();
        Circle circle = new Circle(50);
        circle.setStroke(Color.RED);
        circle.setFill(Color.LIGHTGRAY);
        stackPane.getChildren().add(circle);
        */

        HBox hBox= new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btnEnlarge = new Button("Enlarge");
        btnEnlarge.setOnAction(new EnlargeHandler());
        Button btnShrink = new Button("Shrink");
        btnShrink.setOnAction(new ShrinkHandler());
        hBox.getChildren().addAll(btnEnlarge,btnShrink);

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(hBox);
        //borderPane.setCenter(stackPane);
        borderPane.setCenter(circlePane);
        //borderPane.setAlignment(hBox,Pos.CENTER);
        BorderPane.setAlignment(hBox,Pos.CENTER);

        Scene scene = new Scene(borderPane,250,250);
        primaryStage.setTitle("DawangControlledCircle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    class EnlargeHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            circlePane.enlarge();

        }
    }

    class ShrinkHandler implements  EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            circlePane.shrink();
        }
    }
}

class CirclePane extends StackPane{

    private Circle circle = new Circle(50);
    public CirclePane(){
        getChildren().add(circle);
        circle.setStroke(Color.RED);
        circle.setFill(Color.LIGHTGRAY);

    }

    public void enlarge(){
        circle.setRadius(circle.getRadius() + 2);
    }

    public void shrink(){
        circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() -2 : circle.getRadius());
    }

}
