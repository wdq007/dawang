package com.dawang.introjava.comprehensive.demo;

/**
 * Page 652
 * 程序清单1-2
 * 单独定义枚举类型
 * 枚举类型作为 一个独立的类来对待。程序编译后，将创建一个名为 Day.class 的类。
 */


enum Day {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}

public class StandaloneEnumTypeDemo {
    public static  void main(String[] args){

        Day day1 = Day.FRIDAY;
        Day day2 = Day.THURSDAY;

        System.out.println("day1's name "+day1.name());
        System.out.println("day2's name "+day2.name());
        System.out.println("day1's ordinal "+day1.ordinal());
        System.out.println("day2's ordinal "+day2.ordinal());

        System.out.println("day1.toString() returns"+day1.toString());
        System.out.println("day1.equals(day2) returns " +day1.equals(day2));
        System.out.println("day2.compareTo(day2) returns "+ day1.compareTo(day2));
        //每个枚举类型有一个静态方法 valueO, 可以返回这个类型中所有的枚举值到一个数组
        Day[] days = Day.values();
        for(Day day:days){
            System.out.println(day);
        }
    }


}
