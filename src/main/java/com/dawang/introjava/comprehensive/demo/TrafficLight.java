package com.dawang.introjava.comprehensive.demo;


/**
 * Page 654
 * 程序清单1-3
 */

public enum TrafficLight {
    //定义了枚举值, 值的声明必须是类型声明的第一条语句
    RED ("Please Stop"), GREEN ("Please go"), YELLOW ("Please caution");
    //一个名为 description 的数据域
    //
    private String description;
    //构造方法 TrafficLight
    //当访问枚举值的时候，构造方法将被调用。枚举值的参数将传递给构造方法， 在构造方法中賦值给 description。
    //Java语法要求枚举类型的构造方法是私有的，避免被直接调用.
    //私有修饰符可以省 略。在这种情况下，被默认为是私有的。
    private TrafficLight(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

}
