package com.dawang.introjava.comprehensive.algorithm;

import java.util.Scanner;

public class ImprovedFibonacci {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index for the Fibonacci number:");
        int n = input.nextInt();
        System.out.printf("Fibonacci number at index %d is %d%n", n,fib(n));




    }


  //0 1 1 2 3 5 8 13
    public static long fib(int n){
        long f0 = 0;
        long f1 = 1;
        long f2 = 1;
        if(n == 0){
            return f0;
        }else if (n == 1){
            return f1;
        }else if(n == 2){
            return f2;
        }
        for(int i =3;i<n;i++){
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;

        }
        return f2;
    }

    public static long recursiveFib(int n){
        if(n == 0 ){
            return n;
        }else if(n == 1){
            return n;
        }else{
            return recursiveFib(n-1)+recursiveFib(n-2);
        }

    }
}
