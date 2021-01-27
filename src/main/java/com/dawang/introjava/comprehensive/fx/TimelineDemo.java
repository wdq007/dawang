package com.dawang.introjava.comprehensive.fx;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/** Page 530
 * 程序清单 15-15 文本交替的显示和消失来产生闪烁动画效果。
 *
 *
 */

public class TimelineDemo extends Application {
    @Override
    public void start(Stage primaryStage){

        StackPane stackPane = new StackPane(); //创建一个堆栈面板
        Text text  = new Text(20,50,"Programming is fun");
        text.setFill(Color.RED);
        stackPane.getChildren().add(text);
        //一个处理器被创建
        EventHandler<ActionEvent> eventHandler = e ->{
            if (text.getText().length() != 0){ //如果文本非空，则将本文设置为空字符串
                text.setText("");
            }else{
                text.setText("Programing is fun"); //如果文本为空，则设置为 “ Programming is fun”
            }
        };
        //一个 Timeline 动画被创建以获得一个关键帧
        //一个 KeyFrame被创建用于每半秒钟运行一个动作事件
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(500),eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE); //动画被设置为无限运行
        animation.play();
        //程序为文本设置鼠标单击事件
        text.setOnMouseClicked(e ->{
            if(animation.getStatus()== Animation.Status.PAUSED){
                animation.play(); //如果动画暂停了，鼠标在文本上单击一次会继续动画
            }else{
                animation.pause();//如果动両正在执行，那么在文本上的一次鼠标单击将暂停动画
            }
        });

        Scene scene = new Scene(stackPane,300,300);
        primaryStage.setTitle("TimelineDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
