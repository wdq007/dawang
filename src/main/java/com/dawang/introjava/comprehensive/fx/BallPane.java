package com.dawang.introjava.comprehensive.fx;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 * Page533 程序清单15-17
 * Pane类的子类，用于显示一个弹动的球
 *
 */
public class BallPane extends Pane {
    public final double radius = 20;
    private double x = radius, y = radius;
    private double dx = 1, dy = 1;
    private Circle circle = new Circle(x,y,radius);
    private Timeline animation;


    public BallPane(){
        circle.setFill(Color.GREEN);
        getChildren().add(circle);
        //一个 Timeline 的实例被创建用于控制动両
        animation = new Timeline(new KeyFrame(
                Duration.millis(50),e->moveBall())); //该实例包含一个 KeyFrame 对象，在一个固定的速率上调 用 moveBall()方法
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }

    //恢复动画
    public void play(){
        animation.play();

    }
    //暂停动画
    public void pause(){
        animation.pause();
    }
    //增加动両速度
    public void increaseSpeed(){
        animation.setRate(animation.getRate()+0.1);
    }
    //减小动両速度
    public void decreaseSpeed(){
        animation.setRate(animation.getRate()>0 ? animation.getRate()-0.1:0);
    }
    //返回一个速率的绑定属性
    public DoubleProperty rateProperty(){
        return animation.rateProperty();
    }
    //移动球以模拟动画
    public void moveBall(){
        //当球超出水平边界时，dx的符号发生改变(从正改变 为负，或者相反) 这使得球改变它水平移动的方向
        if(x<radius || x >getWidth() - radius){
            dx *= -1;
        }
        //当球超出垂直边界时, dy的符号发生改变(从正改变为负，或者相反) 这使得球改变它垂直移动 的方向
        if(y<radius || y > getHeight() - radius){
            dy *= -1;
        }
        //球的中心位于(x，y),下一个移动中改变成(x+dx，y+dy)
        x += dx;
        y += dy;
        circle.setCenterX(x);
        circle.setCenterY(y);
    }

}
