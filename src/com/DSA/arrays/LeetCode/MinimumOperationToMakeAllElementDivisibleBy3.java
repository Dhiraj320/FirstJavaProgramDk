package com.DSA.arrays.LeetCode;
//https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/

public class MinimumOperationToMakeAllElementDivisibleBy3 {
    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        System.out.println(minimumOperationsWay1(nums));
        System.out.println(minimumOperationsWay2(nums));

    }

    public static int minimumOperationsWay1(int[] nums) {
        int operation=0;
        for(int num:nums) {
            if (num%3 != 0) {
                    operation++;
                }

        }
        return operation;

    }
    //way2
    public static int minimumOperationsWay2(int[] nums) {
        int operation=0;
        for(int num:nums) {
            int remainder=num%3;
            if (remainder!= 0) {
                operation++;
            }

        }
        return operation;

    }
}
