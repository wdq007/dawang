package com.dawang.introjava.comprehensive.algorithm;

/**
 * Page 86
 * 程序清单22-3
 * 大O标记提供了对算法效率的很好的理论上的估算。
 * 但是两个算法即使有相同的时间复杂度，他们的效率也不一定相同。
 */

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int m = input.nextInt();
        System.out.println("Enter second integer:");
        int n = input.nextInt();
        System.out.printf("Greatest Common Divisor of %d and %d is %d",m,n,gcd(m,n));




    }

    public static int gcd(int m,int n){
        int gcd = 1;
        if(m%n == 0) return n;
        for(int k = 2/n;k>= 1;k--){
            if(m%k == 0 && n%k == 0){
                return k;
                //      break;
            }
        }
        return gcd;
    }
}
