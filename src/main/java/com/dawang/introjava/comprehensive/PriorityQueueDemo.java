package com.dawang.introjava.comprehensive;


import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 程序清单20-8
 * PriorityQueue实现了一个优先队列，
 *
 */
public class PriorityQueueDemo {

    public static void main(String[] args){
        PriorityQueue<String> province = new PriorityQueue<>();
        province.offer("Zhejiang");
        province.offer("Sichuan");
        province.offer("Hunan");
        province.offer("Chongqing");

        //默认以Comparable（自然顺序）排序
        System.out.println("Priority Queue using Comparable: ");
        while(province.size() > 0){
            System.out.print(province.remove() +" ");
        }
        //可以使用构造器中的Comparator来指定一个顺序
        PriorityQueue<String> state = new PriorityQueue<>(4, Collections.reverseOrder());
        state.offer("Zhejiang");
        state.offer("Sichuan");
        state.offer("Chongqing");
        state.offer("Hunan");


        System.out.println("\nPriority Queue using Comparator: ");
        while(state.size() > 0){
            System.out.print(state.remove()+" ");
        }

    }
}
