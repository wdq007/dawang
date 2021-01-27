package com.dawang.introjava.comprehensive.demo;

/**
 * Page 652
 * 程 序 清 单 I-1
 * 枚举类型可以在一个类中定义, 枚举类型被作为内部类对待
 * 程序 -编译后，将创建一个名为 EnumeratedTypeDemoSDay 的类
 * 当一个枚举类型在一个类中声明时，类型必须声明为类的一个成员 ，而不能在一个 方法中声明。而且，类型总是static的
 * 可以用于内部类的可见性修钸符也可以应用到在一个类中定义的枚举类
 *
 *
 * 使用枚举值(例如，Day.MONDAY,Day.TUESDAY,等等)而不是字面量整數值(例如，
 * 0,1,等等)可以让程序更加易于阅读和维护。
 */

public class EnumeratedTypeDemo {
    //定义了枚举类型Day
    //类型总是static的。由于这个原因，程序清单丨1第2行的static关键字可以省略
    static enum Day{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY

    };

    public static void main(String[] args){
        //賦枚举值
        Day day1 = Day.FRIDAY;
        Day day2 = Day.THURSDAY;
        System.out.println("day1's name is "+day1.name());
        System.out.println("day2's name is "+day2.name());
        System.out.println("day1's ordinal is "+day1.ordinal());//序号值为5
        System.out.println("day2's ordinal is "+day2.ordinal());//序号值为4
        //一个枚举类型是 Object 类和 Comparable 接口的子类
        System.out.println("day1.equals(day2) returns "+day1.equals(day2)); //调用equals, 如果dayl和day2具有 同样的序号数，dayl.equals(day2)返回真。
        System.out.println("day1.toString() returns "+day1.toString());
        System.out.println("day1.compareTo(day2) returns "+day1.compareTo(day2));//返回dayl的序号数到 day2的序号数之间的差距



    }
}
