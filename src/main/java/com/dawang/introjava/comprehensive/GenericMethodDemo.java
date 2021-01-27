package com.dawang.introjava.comprehensive;


/** Page 6
 * 程序清单19-2
 *
 */

public class GenericMethodDemo {
    public static void main(String[] args){
        Integer[] integers = {1,2,3,4,5};
        String[] strings = {"Beijing","Shanghai","Shenzhen","Guanzhou","Hangzhou"};
        //为了调用泛型方法，需要将实际类型放在尖括号内作为方法名饿前缀
        GenericMethodDemo.<Integer>print(integers);
        //实际类型没有明确指定，编译器自动发现实际类型
        GenericMethodDemo.print(strings);


    }
    //为了声明泛型方法， 将泛型类型<E>置于方法头中关键字static之后
    public static <E> void print(E[] list){
        for(int i = 0;i<list.length;i++){
            System.out.print(list[i]+" ");
            System.out.println();
        }

    }
}
