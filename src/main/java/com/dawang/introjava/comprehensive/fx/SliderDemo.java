package com.dawang.introjava.comprehensive.fx;


import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Page 566
 * 程序清单16-11
 */
public class SliderDemo extends Application {
    @Override
    public void start(Stage primaryStage){

        Text text = new Text(20,20,"Java Promgramming");

        Slider slHorizontal = new Slider();
        slHorizontal.setShowTickMarks(true);
        slHorizontal.setShowTickLabels(true);


        Slider slVertical = new Slider();
        slVertical.setOrientation(Orientation.VERTICAL);
        slVertical.setShowTickMarks(true);
        slVertical.setShowTickLabels(true);
        slVertical.setValue(100);

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);

        BorderPane pane = new BorderPane();
        pane.setCenter(paneForText);

        pane.setBottom(slHorizontal);
        pane.setRight(slVertical);

        slHorizontal.valueProperty().addListener(ov->
                text.setX(slHorizontal.getValue()*paneForText.getWidth()/slHorizontal.getMax()));
        //由 于一个垂直滑动条的值从上到下是递减的，文本的对应Y值做相应调整。
        slVertical.valueProperty().addListener(ov->
                //text.setY(slVertical.getValue()*paneForText.getHeight()/slVertical.getMax())
                text.setY((slVertical.getMax()-slVertical.getValue())*paneForText.getHeight()/slVertical.getMax())

        );


        Scene scene = new Scene(pane,300,200);
        primaryStage.setTitle("SliderDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
