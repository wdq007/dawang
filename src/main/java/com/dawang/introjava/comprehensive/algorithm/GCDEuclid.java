package com.dawang.introjava.comprehensive.algorithm;

/**
 * Page 87
 * 程序清单22-4
 * 公元前300年欧几里得发现，最著名的古老算法之一, 即欧几里得算法
 * 时间复杂度为O(logn)
 * 用gcd(m,n)表示整数m，n的最大公约数
 * 如果m%n为0，那么gcd(m，n)为n
 * 否则gcd(m，n)就是gcd(n，m%n)
 */

import java.util.Scanner;

public class GCDEuclid {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first integer: ");
        int m = input.nextInt();
        System.out.println("Please enter second integer: ");
        int n = input.nextInt();
        System.out.printf("The Greatest common divisor" +
                "for %d and %d is %d", m,n,gcd(m,n));

    }
    public static int gcd(int m,int n){
        if(m%n == 0){
            return n;
        }else{
            return gcd(n,m%n);
        }
    }
}
