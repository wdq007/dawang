package com.dawang.introjava.comprehensive.demo;

import java.util.Scanner;

public class DawangFractional {


    public DawangFractional(){
        //DawangFractional f = new DawangFractional();
    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int base = in.nextInt();

        //System.out.println("Fraction of "+base+" is "+computeFractional(base));
        //System.out.println("Serial add of "+base+" is "+ computeAdd(base));
        //System.out.println("ComputeTen result for "+base+" is "+computeTen(base));
        //computeTen(base);
        //System.out.println("Power of "+base+" is "+computePower(base));
        //System.out.println(computePowerX(5,2));
        //System.out.println(fibonacci(base));

        //xMethod(base);

        //DawangFractional d = new DawangFractional();
        //System.out.println(d.toString());
        //System.out.println(isPalindromeImproved("noon"));

        /*double[] d = {0.9,0.3,9.8,1.9,1.5};
        recursiveSelectionSort(d);
        for(double n :d){
            System.out.println(n);
        }*/

        int[] num = {2,4,6,8,9,18,99};
        System.out.println(recursiveBinarySearch(num,9));

    }

    public static long computeFractional(int n){

        if (n == 0){
            return 1;
        }else {
            return n * computeFractional(n - 1);
        }
    }


    public static long computePower(int n){
       if (n == 0){
           return 1;
       }else{
           return 2*computePower(n-1);
       }
    }

    public static long computePowerX(int n, int x){
        if(n == 0){
            return 1;
        }else{
            return x*computePowerX(n-1,x);
        }
    }

    public static long computeAdd(int n){

        if (n == 1){
            return 1;
        }else{
            return n+ computeAdd(n-1);
        }
    }

    public static long fibonacci(int n){


        if(n<2){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static void computeTen(int n){
        if(n>0){
            System.out.print(n%10+" ");
            computeTen(n/10);
        }

    }
    public static void xMethod(int n){

        /*if(n> 0){
           System.out.println(n+" ");
            xmathod(n-1);
            System.out.println(n+" ");

        }*/

        if(n != 0){
            System.out.println(n);
            xMethod(n/10);
        }

        //System.out.println(n);
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 0) {
            return true;
        }else if(s.charAt(0) != s.charAt(s.length() -1)){
            return false;

        }else{
            return isPalindrome(s.substring(1,s.length()-1));
        }

    }

    public static boolean isPalindromeImproved(String s){
        return isPalindromeImproved(s,0,s.length()-1);

    }

    public static boolean isPalindromeImproved(String s,int low,int high){
        if(s.length()<= low){
            return true;
        }else if (s.charAt(low) != s.charAt(high)){
            return false;
        }else{
            return isPalindromeImproved(s,low+1,high-1);
        }
    }

    public static void recursiveSelectionSort(double[] list){
       recursiveSelectionSort(list,0,list.length-1);

    }

    /*
    double[] d = {0.9,0.3,9.8,1.9,1.5};
    d,0,4 => indexofMin = 0; min = 0.9; d[1] = 0.3 < 0.9, min = 0.3, indexofMin = 1;d[1] = 0.9,d[0]=0.3

    double[] d = {0.3,0.9,9.8,1.9,1.5};
    d,,1,4 => indexofMin = 1;min = 0.9;d[
     */

    public static void recursiveSelectionSort(double[] list, int low, int high){
        if(low < high){
            int indexOfMin = low;
            double min = list[low];
            for(int i=low+1;i<high;i++){
                if (list[i] < min){
                    min = list[i];
                    indexOfMin = i;
                }
            }
            list[indexOfMin] = list[low];
            list[low] = min;
            recursiveSelectionSort(list,low+1,high);
        }


    }

    public static int recursiveBinarySearch(int[] list, int key){
        return recursiveBinarySearch(list,key,0,list.length);


    }
    public static int recursiveBinarySearch(int[] list,int key, int low, int high){
        if(low >high){
            return -low -1;
        }

        int mid = (low+high)/2;

        if(key < list[mid]){
            return recursiveBinarySearch(list,key,low,mid-1);

        }else if(key == list[mid]){
            return mid;
        }else{
            return recursiveBinarySearch(list,key,mid+1,high);
        }
    }
}
