package com.dawang.introjava.comprehensive.algorithm;

/**
 * Page 89
 * 程序清单22-5 素数prime
 * 对于一个大于1的整数，如果其除数只有1和它本身，那么它就是一个素数
 * 算法一：程序清单 5-15 给出了求一个素数的穷举算法。
 * 检测2，3，4，5.....n-1，能否整除n， 如果不能， n就是素数。
 * 这个算法耗费O(n)的时间复杂度
 * 算法二： 只需要检测2，3，4，5...n/2是否能整除n。可以提高效率。
 * 但是时间复杂度仍是O(n)
 * 算法三：如果n不是素数， 那么n必须又一个大于1且小于等于平方根n的因子
 * n不是素数， 所以会存在两个数p和q， 满足n=pq且1<p<=q
 * n=两个平方根n的乘积，p必须小于或等于平方根n， 因此只需要检测
 * 2，3，4，5到平方根n能否被n整除， 如果不能，n就是素数
 * 这时候时间复杂度为O(平方根n)
 */

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Find all prime numbers <= n" +
                " enter n:");
        int n = input.nextInt();

        final int NUMBER_PER_LINE = 10;
        int count = 0;
        int number = 2;

        System.out.println("The prime numbers are:");
        while(number <= n){
            boolean isPrime = true;
            for(int divisor = 2;divisor<=(int)(Math.sqrt(
                    number));divisor++){
                if(number % divisor == 0){
                    isPrime= false;
                    break;
                }
            }
            if(isPrime) {
                count++;

                if (count % NUMBER_PER_LINE == 0) {
                    System.out.printf("%7d\n", number);
                } else {
                    System.out.printf("%7d", number);
                }
            }
            number++;
        }
        System.out.println("\n"+count+" prime(s) less" +
                " than or equal to "+n);


    }


}
