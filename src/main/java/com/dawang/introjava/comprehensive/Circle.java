package com.dawang.introjava.comprehensive;


/**
 * Page 351
 * 程序清单11-2 CircleFromSimpleGeometricObject.java
 * 程序清单 13-2
 * 岡是一个特殊类型的几何对象，所以它和其他几何对象共享共同的厲性和方法。
 * 通过继承自 CeometricObject 类来定义 Circle 类是合理的。
 * Circle 类继承了 CeometricObject 类所有可以访问的数据域和方法。
 * 除此之外，它还 有一个新的数据域 radius, 以 及 与 radius 相关的 get 和 set 方法。
 * 它还包括 getArea()、 getPerimeter()和 getDiameterO 方法以返回圆的面积、周长和直径。
 *
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }
    //重载的构造方法
    public Circle(double radius, String color,boolean filled){
        this.radius = radius;
        setColor(color); //setColor 和 setFilled 方法设置 color 和 filled 属性,这两个公 共方法是在基类 GeometricObject 中定义的，并在 Circle 中继承
        setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void printCircle(){
        System.out.println("The Circle is created " + getDateCreated() +
                " and radius is " + radius);
    }


}
