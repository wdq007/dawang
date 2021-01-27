package com.dawang.introjava.comprehensive.fx;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 *  Page 524
 *  程序清单 15-11 DisplayResizableClock.java
 *  添加一个监听器来修改时钟面板的大小，然后将这个监听器和窗体的宽度和高度属性进行注册
 *  对比 程序清单 14-20, 当修改窗体大小的时候，时钟面板的大小不会改变
 *
 */
public class DisplayResizableClock extends Application {
    @Override
    public void start(Stage primaryStage){
        ClockPane clockPane = new ClockPane();
        String timeString = clockPane.getHour()+":"+clockPane.getMinute()+":"+clockPane.getSecond();
        Label labelCurrentTime = new Label(timeString);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(clockPane);
        borderPane.setBottom(labelCurrentTime);

        BorderPane.setAlignment(labelCurrentTime, Pos.TOP_CENTER);

        Scene scene = new Scene(borderPane,300,300);
        primaryStage.setTitle("DisplayResizableClock");
        primaryStage.setScene(scene);
        primaryStage.show();

        borderPane.widthProperty().addListener(ov ->
                clockPane.setW(borderPane.getWidth()));


        borderPane.heightProperty().addListener(ov ->
                clockPane.setH(borderPane.getHeight()));
    }

}
