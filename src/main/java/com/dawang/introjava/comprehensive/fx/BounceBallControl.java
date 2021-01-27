package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

/**
 * Page 534 程序清单 15-18 使用鼠标动作控制弹球
 * Application 的子类
 * 当鼠标按下的时候动画暂停，当鼠标释放的时候动画恢复执行。
 * 按下 UP / DOWN 方向键可以增加 / 减少动画的速度。
 */

public class BounceBallControl extends Application {
    @Override
    public void start(Stage primaryStage){
        BallPane ballPane = new BallPane();

        //鼠标按下和鼠标释放的处理器以暂停和恢复动画
        ballPane.setOnMousePressed(e->ballPane.pause());
        ballPane.setOnMouseReleased(e->ballPane.play());

        ballPane.setOnKeyPressed(e->{
            if(e.getCode() == KeyCode.UP){ //当UP方向键被按下,弹球面板的increaseSpeed方法被调用以增加球的移动
                ballPane.increaseSpeed();
            }else if(e.getCode() == KeyCode.DOWN){ //当DOWN方向键被按下，弹球面板的decreaseSpeed方法被调用以减少球的移动
                ballPane.decreaseSpeed();
                    }
                }
                );


        Scene scene = new Scene(ballPane,300,300);
        primaryStage.setTitle("BounceBallControl");
        primaryStage.setScene(scene);
        primaryStage.show();
        //将输入焦点设置到 ball Pane 上
        ballPane.requestFocus();
    }
}
