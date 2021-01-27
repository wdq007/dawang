package com.dawang.introjava.comprehensive;

/**
 * Page 351
 * 程序清单11-3 RectangleFromSimpleGeometricObject.java
 * 程序清单13-3 Rectangle 也可以定义为GeometricObject 的子类。
 * Rectangle 类从 CeometricObject 类继承所有可访问的数据域和方法。
 * 此外，它还有width和height数据域，以及和它们相关的get和set方法。它还包括 getArea()和getPerimeter()方法返回矩形的面积和周长。
 * 如果类 Cl 扩展自另一个类 C2, 那么就将 Cl 称为次类(subclass), 将 C2称为超类(superclass)。
 * 超类也称为父类 (parentclass)或基类 (baseclass),次类又称为子类(child class)、扩展类(extended class)或派生类(derived class)。
 * 子类从它的父类中继 承可访问的数据域和方法，还可以添加新数据域和新方法。
 */

//指向父类的三角箭头用来表示相关的两个类之间的继承关系。
public class Rectangle extends GeometricObject {
    private double width;
    private  double height;

    public  Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;

    }

    public Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }


    public double getWidth(){
        return  width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }


    public double getArea(){
        return width * height;
    }

    public  double getPerimeter(){
        return  2 * (width + height);
    }


}
