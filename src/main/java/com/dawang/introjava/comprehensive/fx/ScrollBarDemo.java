package com.dawang.introjava.comprehensive.fx;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Page
 * 程序清单16-10
 * 创建一个Text对象，将它放置于边框面板的中央。
 * 创建一个垂直滚动条，将它放到边框面板的右边。
 * 创建一个水平滚动条，将它放到边框面板的底部。
 * 创建一个监听器，当滚动条中的滑块由于value属性的改变而产生移动时，监听器方法 相应移动文本。
 */

public class ScrollBarDemo extends Application {

    @Override
    public void start(Stage primaryStage){
        //创建一段文本
        Text text  = new Text(20,20,"Java Programing");
        //两个滚动条
        ScrollBar sbHorizontal = new ScrollBar();
        ScrollBar sbVertical = new ScrollBar();

        sbVertical.setOrientation(Orientation.VERTICAL);
        //将文本放在一个面板中
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);

        BorderPane pane = new BorderPane();
        //然后面板置于边框面板的中央
        pane.setCenter(paneForText);
        //将 sbHorizontal 和 sbVertical 分别放置在边框面板的右侧和底部
        pane.setRight(sbVertical);
        pane.setBottom(sbHorizontal);
        //注册一个监听器
        sbHorizontal.valueProperty().addListener(ov->text.setX(
                sbHorizontal.getValue()*paneForText.getWidth()/sbHorizontal.getMax())

        );

        sbVertical.valueProperty().addListener(ov-> text.setY(
                sbVertical.getValue()*paneForText.getHeight()/sbVertical.getMax()));

        Scene scene = new Scene(pane,400,400);
        primaryStage.setTitle("ScrollBarDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    }


