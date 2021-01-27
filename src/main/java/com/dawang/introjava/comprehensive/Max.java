package com.dawang.introjava.comprehensive;


/**
 * 程序清单19-5
 */
public class Max {
    public static Comparable max(Comparable o1,Comparable o2){ //o1,o2是原始类型， 是不安全的
        if(o1.compareTo(o2) > 0) {
            return o1;
        } else{
            return o2;
            }


    }
}
