package com.DSA.sorting.cyclic_sort_leetcode_question;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
import java.util.ArrayList;
import java.util.List;

public class Disappeared_448 {
    public static void main(String[] args) {

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i]!= nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int index=0; index <nums.length;index++){
            if(nums[index]!=index+1){
                result.add(index+1) ;
            }
        }
        return result;


    }


    static void swap(int[]nums, int first , int second){

        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]=temp;

    }





}
