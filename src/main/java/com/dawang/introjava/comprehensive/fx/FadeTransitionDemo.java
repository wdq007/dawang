package com.dawang.introjava.comprehensive.fx;


import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 *
 * 程序清单 15-14
 * 将一个褪色变化应用在一个椭圆的填充颜色中
 */
public class FadeTransitionDemo extends Application {
    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();
        Ellipse ellipse = new Ellipse(10,10,100,50);
        ellipse.setFill(Color.GREEN);
        ellipse.setStroke(Color.BLACK);
        //椭圆的 centerX、centerY、radiusX 和 radiusY 属性绑定到面板的大小上
        ellipse.centerXProperty().bind(pane.widthProperty().divide(2));
        ellipse.centerYProperty().bind(pane.heightProperty().divide(2));

        ellipse.radiusXProperty().bind(pane.widthProperty().multiply(0.4));
        ellipse.radiusYProperty().bind(pane.heightProperty().multiply(0.4));
        pane.getChildren().add(ellipse);


        FadeTransition ft = new FadeTransition(Duration.millis(3000),ellipse); //持续时间为 3 秒的褪色转换对象
        ft.setFromValue(1.0); //将开始的透明度设置 为1.0
        ft.setToValue(0.1); //结束透明度设为0.1
        ft.setCycleCount(Timeline.INDEFINITE); //循环数设置为无限，因此动画将无限次 数的重复
        ft.setAutoReverse(true);
        ft.play();

        ellipse.setOnMousePressed(e->ft.pause()); //当单击鼠标时，动画暂停
        ellipse.setOnMouseReleased(e -> ft.play()); //当鼠标释放的时候，动画从暂 停的地方继续


        Scene scene = new Scene(pane,300,300);
        primaryStage.setTitle("FadeTransitionDemo");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
