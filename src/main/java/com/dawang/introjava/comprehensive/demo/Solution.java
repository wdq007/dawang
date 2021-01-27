package com.dawang.introjava.comprehensive.demo;


class Solution {
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i=0;i<3;i++){
             if(guess[i] == answer[i]){
                count++;
             }
        }
        return count;
    }

    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] newSum = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<=i;j++){
                sum += nums[j];

            }
            newSum[i] = sum;
            sum = 0;
        }
        return newSum;
        /*
        i = 0; nums[0] = 1;j=0; sum = 0+1 = 1;
        i = 1; nums[1] = 2;j=0;sum = 0+1=1;j=1;sum = 1+2 = 3;

         */
    }


    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int p =0, q = 1;
        while(p<q && q<nums.length){
            if(nums[p] == nums[q]){
                 count++;
            }
            q++;
            if (q==nums.length){
                p++;
                q = p+1;
            }
        }
        return count;
    }

    public int xorOperation(int n, int start) {
        int[] num = new int[n];
        int temp = start;
        //System.out.println(temp);
        for(int i=1;i<n;i++){
            num[i] = start + 2*i;
            //System.out.println(num[i]);
            temp = temp ^ num[i];
        }
        return temp;


    }


    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        //System.out.println(address.indexOf('.'));
        //char c = '.';
        //
        //String[] newString = address.split(".");
        //System.out.println(address.replaceAll("\\.","[.]"));

        for(int i=0;i<address.length();i++){
            if(address.charAt(i) == '.'){
                sb.append("[.]");
            }else{
                sb.append(address.charAt(i));
            }
        }

       
        return sb.toString();

    }



    public static void main(String[] args){

        Solution solution = new Solution();

       /*
       int[] test ={1,2,3};
        int[] test1 ={1,2,1};
        Solution solution = new Solution();
        System.out.println(solution.game(test, test1));
        */
        //int[] nums = {1,2,3,4};
        //int[] nums = {1,1,1,1,1};
        //int[] nums = {3,1,2,10,1};

        /* for runningSum
        int[] nums={};
        Solution solution = new Solution();
        int[] sum = solution.runningSum(nums);
        for(int i = 0;i<sum.length;i++){
            System.out.println(sum[i]);
        }
        */

        /*
        int[] nums = {1,2,3,1,1,3};
        System.out.println(solution.numIdenticalPairs(nums));
        */
        //System.out.println(solution.xorOperation(10,5));
        //System.out.println(4^5);
        //solution.defangIPaddr("255.100.50.0");

        System.out.println(solution.defangIPaddr("255.100.50.0"));



    }
}