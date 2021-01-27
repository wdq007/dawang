package com.dawang.introjava.comprehensive.fx;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 * Page 531
 * 程序清单 15- 16 钟表每一秒显示一次最新的当前时间
 */
public class ClockAnimation extends Application{
    @Override
    public void start(Stage primaryStage){
        //ClockPane类在程序清单14-21中定义
        ClockPane clockPane = new ClockPane(); //创建一个ClockPane的实例clockPane用于显示一个时钟
        //一个事件处理器被创建用于在时钟中设置当前事件
        EventHandler<ActionEvent> eventHandler = e ->{
            clockPane.setCurrentTime();

        };
        //在时间线动画的每个关键帧中，这个处理器每秒被调用一次,所以动画中时钟的时间每秒被更新一次
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000),eventHandler));//
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        Scene scene = new Scene(clockPane,300,300);
        primaryStage.setTitle("ClockAnimation");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
