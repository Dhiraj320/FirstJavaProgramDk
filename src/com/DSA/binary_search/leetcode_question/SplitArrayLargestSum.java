package com.DSA.binary_search.leetcode_question;
//https://leetcode.com/problems/split-array-largest-sum/description/

public class SplitArrayLargestSum {
    public static void main(String[] args) {

    }
    //k or m same

    public int splitArray(int[] nums, int k) {
        int start =0;
        int end =0;
        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);
            end +=nums[i]; // in the end of the loop this will contain max item from the array

            // binary search apply we have start and end
            while(start < end){

                //try mid for as potential ans
                int mid = start+(end-start)/2;
                // calculate how many pieces you can divide this in with this max sum
                int sum =0;
                int pieces=1;
                for (int num:nums) {
                    if(sum+num>mid){
                        //you can not add in this subarray make new one
                        //say you add this num in new subarray, then sum =num
                        sum =num;
                        pieces++;
                    }else{
                        sum+=num;
                    }

                }
                if(pieces>k){
                    start=mid+1;

                }else{
                    end =mid;
                }


            }

        }
        return end; // here start==end

    }
}
