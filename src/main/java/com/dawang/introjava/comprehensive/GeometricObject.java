package com.dawang.introjava.comprehensive;

/**
 * Page 425
 * 程序清单13-1 抽象类 GeometricObject 为几何对象定义了共同特征(数据和方法)，并且提供了合适的构造方法。
 * 因为不知道如何计算几何对象的面积和周长，所以，getArea() 和getPerimeter()定义为抽象方法。这些方法在子类中实现。
 * Circle类和Rectangle类的父类
 * 因为可以计算所有几何对象的面积和周 长, 所以最好在 GeometricObject 类中定义 getAreaO 和 getPerimeterO 方法。
 * 但是，这 些方法不能在 GeometricObject 类中实现，因为它们的实现取决于几何对象的具体类型。
 * 在类头使用abstract 修饰符表示该类为抽象类。
 *
 * 在 UML 图形记号中，抽象类和抽象方法的名字用斜体表示
 */

//抽象类和常规类很像，但是不能使用 new 操作符创建它的实例。
//一个通用类 CeometricObject 可以用来建模所有的几何对象。
public abstract class GeometricObject {
    private String color = "white"; //属性 color
    private boolean filled; //属性 filled
    private java.util.Date dateCreated; //dateCreated 属性
    //抽象类的构造方法定义为 Protected, 因为它只被子类使用。
    //创建一个具体子类的实例时，它的父类的构造方法被调用以初始化父类中定义的数据域。
    protected GeometricObject(){
        dateCreated = new java.util.Date();
    }

    protected  GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }


    //get 和 set 方法
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        return  this.dateCreated;
    }

    @Override
    public String toString(){
        return "\ncreated on "+ dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
    //抽象方法只有定义而没 有实现
    //它的实现由子类提供。一个包含抽象方法的类必须声明为抽象类。
    public  abstract double getArea();

    public abstract double getPerimeter();

}
