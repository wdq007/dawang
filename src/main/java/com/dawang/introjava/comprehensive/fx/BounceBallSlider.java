package com.dawang.introjava.comprehensive.fx;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Page 567
 * 程序清单16-12
 *
 */

public class BounceBallSlider extends Application {
    @Override
    public void start(Stage primaryStage){

        BallPane ballPane = new BallPane();

        Slider slSpeed = new Slider();
        //将速度设置为一个 0 和 20 之间的值
        slSpeed.setMax(20);
        //BallPane 的 ratePropertyO 方法返回一个动画速度的属性值。如果速度为 0, 动画停止;如果速度高于 20, 动画将过快
        ballPane.rateProperty().bind(slSpeed.valueProperty()); //值绑定到滑动条值上
        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setBottom(slSpeed);

        Scene scene = new Scene(pane,300,200);
        primaryStage.setTitle("BounceBallSlider");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
