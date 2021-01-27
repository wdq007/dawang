package com.dawang.introjava.comprehensive.demo;

public class OptimizedSolution  extends Solution{


    /**
     * 动态规划
     * @param nums
     * @return int[] temp
     *
     */
    public int[] runningSum(int[] nums){
        int[] temp = new int[nums.length];
        temp[0] = nums[0];

        for(int i =1;i<nums.length;i++){
            temp[i] = temp[i-1]+nums[i];
        }
        return temp;

    }

    public int xorOperation(int n, int start) {

        int temp = 0;
        for(int i=0;i<n;i++){
            temp ^= (start +2*i);
        }

        return temp;


    }


    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        //int[] nums = {1,1,1,1,1};
        //int[] nums = {3,1,2,10,1};
        //int[] nums={};
        Solution solution = new OptimizedSolution();

        /*
        int[] sum = solution.runningSum(nums);
        for(int i = 0;i<sum.length;i++){
            System.out.println(sum[i]);
        }
        */

        System.out.println(solution.xorOperation(5,0));
    }


}
