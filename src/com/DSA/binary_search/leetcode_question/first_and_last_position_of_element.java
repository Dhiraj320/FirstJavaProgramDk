package com.DSA.binary_search.leetcode_question;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Arrays;

public class first_and_last_position_of_element {
    public static void main(String[] args) {

        int[]nums= {5,7,7,8,8,10};
        int target =8;
        int[] ans= searchRange(nums, target);
        System.out.println(Arrays.toString(ans));


    }

    public static  int[] searchRange(int[] nums, int target) {
        int[]ans ={-1,-1};

        //check for first occurrence if target first
        ans[0] = search(nums, target,true);
        if(ans[0]!=0){
            ans[1] = search(nums, target, false);

        }
        return ans;



    }

    // this function just returns the index value of target

    static int search(int[]nums, int target, boolean findStartIndex){
        int ans=-1;
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                //potential ans found
                ans =mid;
                if(findStartIndex){
                    end =mid-1;


                }else{
                    start =mid+1;
                }
            }
        }
        return ans;


    }
}
