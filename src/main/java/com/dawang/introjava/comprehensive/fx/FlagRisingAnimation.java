package com.dawang.introjava.comprehensive.fx;


import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 *  Page 527, 程序清单 15-13 给出了一个升旗的动画的程序
 *
 *
 */
public class FlagRisingAnimation extends Application {
    @Override
    public void start(Stage primaryStage){

        Pane pane = new Pane();
        //从一个图像文件创建一个图像视图
        ImageView imageView = new ImageView("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1608228249085&di=51459049dae608eb299f0c812f193642&imgtype=0&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fq_70%2Cc_zoom%2Cw_640%2Fimages%2F20190929%2Fd2b5e458bbcf434bb14aa814ddfbd462.jpeg");
        imageView.setFitWidth(150);
        imageView.setFitHeight(100);
        pane.getChildren().add(imageView);
        //创建一个路径移动对象，周期为10秒，使用一条直线 作为路径，图像视图作为节点
        //图像视图将沿着直线移动。由于直线没 有放置在场景中，你不会在窗体中看到直线。
        PathTransition pathTransition = new PathTransition(Duration.millis(10000),new Line(100,200,100,0),
                imageView);

        pathTransition.setCycleCount(5); //循环数被设置为5，因此该动画将重复5次
        pathTransition.play();

        Scene scene = new Scene(pane,300,300);
        primaryStage.setTitle("FlagRisingAnimation");
        primaryStage.setScene(scene);
        primaryStage.show();




    }
}
