package com.DSA.sorting.LeestCodeQuestion;
//https://leetcode.com/problems/sort-colors/description/

//Selection Sort
public class SortColors {
    public static void main(String[] args) {


    }

    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            //find the max item in the remaining array and swapped with correct index
            int lastIndex = nums.length-i-1;
            int maxIndex= getMaxIndex(nums, 0, lastIndex);
            swap(nums, maxIndex,lastIndex );


        }

    }
    static int getMaxIndex(int[]nums, int start , int end){
        int max = start; // assuming starting element value is less
        // so compare with it if less than update otherwise print it
        for(int i = start; i <= end; i++){
            if( nums[max]<nums[i] ){
                max = i;

            }
        }
        return max;
    }
    static void swap(int[]nums, int first , int second){


        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]=temp;

    }

}
