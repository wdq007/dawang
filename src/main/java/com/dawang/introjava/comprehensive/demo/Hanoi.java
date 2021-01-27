package com.dawang.introjava.comprehensive.demo;

import java.util.Scanner;

public class Hanoi {


    public static void main(String[] args){

        System.out.println("Please Enter Layer of Hanoi Tower");
        Scanner input = new Scanner(System.in);
        int layer = input.nextInt();
        towerOfHanoi(layer,"起点","终点","中场休息点");


    }

    public static void towerOfHanoi(int layer, String fromTower,String toTower, String auxTower){
        if(layer == 1){
            System.out.println("Moveing disk "+layer +" from "+fromTower+" to "+toTower);

        }else{
            towerOfHanoi(layer-1,fromTower,auxTower,toTower);
            System.out.println("Moving disk "+layer+" from "+fromTower+" to "+toTower);
            towerOfHanoi(layer-1,auxTower,toTower,fromTower);
        }


    }
}
