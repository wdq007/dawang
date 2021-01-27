package com.dawang.introjava.comprehensive.fx;


import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 * Java语言程序设计 Page 523
 * 程序清单 15-10 ObservablePropertyDemo.java
 *
 */
public class ObservablePropertyDemo {

    public static void main(String[] args){
        DoubleProperty balance = new SimpleDoubleProperty();
        balance.addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("The new value is "+balance.doubleValue());
            }
        });

        balance.setValue(4.5);//引发 balance中的一个改变，通过调用监听器的 invalidated 方法来通知监听器这一变化
    }
}
