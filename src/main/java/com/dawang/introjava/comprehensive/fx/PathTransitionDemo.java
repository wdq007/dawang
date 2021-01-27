package com.dawang.introjava.comprehensive.fx;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 * Page 526 程序清单 15-12
 * PathTransition 类制作一个在给定时间内，节点沿着一条路径从一个端点到另外一个端点的移动动画
 * PathTransition 是 Animation 的子类型
 * 使一个矩形沿着圆移动
 *
 */

public class PathTransitionDemo  extends Application {
    @Override
    public void start(Stage primaryStage){
        //程序创建了一个面板
        Pane pane = new Pane();
        //一个矩形
        Rectangle rectangle = new Rectangle(0,0,25,50);
        rectangle.setFill(Color.ORANGE);
        //一个圆
        Circle circle = new Circle(125,100,50);
        circle.setFill(Color.WHITE);

        circle.setStroke(Color.RED);

        //圆和矩形被放置在面板中
        pane.getChildren().addAll(rectangle,circle);
        //创建了一个路径移动对象
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(4000)); //设置它每个动画周期的持续时间为 4 秒
        pathTransition.setPath(circle); //将圆设置为路径
        pathTransition.setNode(rectangle); //将矩形设置为节点
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT); //设置方向为垂直于切线
        pathTransition.setCycleCount(Timeline.INDEFINITE); //循环次数设为无限多次(第38行)，从而动画将一直持续。
        pathTransition.setAutoReverse(true); //自动倒转设置为真,所以每个交替周期中运动方向会倒转。
        pathTransition.play(); //程序通过调用 play()方法启动动画

        circle.setOnMousePressed(e -> pathTransition.pause() ); //如果pause方法被stop方法替代，动画将在重新开始的时候从最开始状态启动。
        circle.setOnMouseReleased(e->pathTransition.play());

        Scene scene = new Scene(pane,300,300);
        primaryStage.setTitle("PathTransitionDemo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
