package com.dawang.introjava.comprehensive.algorithm;

import java.util.Scanner;

/**
 * Page 93 程序清单22-7
 * Sieve Of Eratosthenes 埃拉托色尼筛选法， 该算法求出所有小于或等于n的素数。
 * Eratosthenes 公元前276-194年， 希腊数学家
 * 使用一个名为primes的数组， 其中有n个布尔值。初始状态时都为true。
 * 因为2， 3， 5的倍数，都不是素数，无需考虑4，6，8的倍数， 因为他们也是2的倍数。
 * 所以只需要考虑k=2，3，5，7，11的倍数
 */
public class SieveOfEratosthenes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Find all prime numbers <=n,enter n: ");

        int n = input.nextInt();

        boolean[] primes = new boolean[n+1];

        for(int i=0;i<primes.length;i++){
            primes[i] = true;
        }

        for(int k=2;k<= n/k;k++){
            if(primes[k]){
                for(int i=k;i<=n/k;i++){
                    primes[k*i] = false;
                }
            }
        }

        int count = 0;
        for(int i =2;i<primes.length;i++){
            if(primes[i]){
                count++;
                if(count % 10 == 0){
                    System.out.printf("%7d\n",i);
                }else{
                    System.out.printf("%7d",i);
                }
            }
        }
        System.out.println("\n"+count + "prime(s) less than or equal to " + n);
    }
}
