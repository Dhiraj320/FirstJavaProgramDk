package com.DSA.sorting.cyclic_sort_leetcode_question;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate442 {

    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i]!= nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        for(int index=0; index <nums.length;index++){
            if(nums[index]!=index+1){
                result.add(nums[index]) ;
            }
        }
        return result;


    }


    void swap(int[]nums, int first , int second){

        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]=temp;

    }
}
