package com.DSA.sorting.cyclic_sort_leetcode_question;
//https://leetcode.com/problems/missing-number/

public class MissingNumber268 {
    public static void main(String[] args) {
        int [] arr= {3,0,1};
        missingNumber(arr);
        System.out.println(missingNumber(arr));




    }

    public static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex = nums[i];
            if(nums[i]<nums.length && nums[i]!= nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
        //search for first missing no
        for(int index=0; index <nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;




    }
    static void swap(int[]nums, int first , int second){

        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]=temp;

    }
}
