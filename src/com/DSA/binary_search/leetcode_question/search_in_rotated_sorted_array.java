package com.DSA.binary_search.leetcode_question;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class search_in_rotated_sorted_array {
    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));


    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        //if you did not find a pivot , it mean the array is not rotated
        if(pivot==-1){
            // just do normal binar search
            return binarySearch(nums, target, 0, nums.length-1);
        }
        //if pivot is found, you have found 2 ascending sorted array

        if(nums[pivot]== target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);




    }
    static int binarySearch(int[] arr, int target, int start, int end){

        while(start<=end){
            //find middle element

            int mid =start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;

            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
            // if any of them if else condition true then element not found

        }
        return -1;

    }
    // this will not work on duplicate value
    /*static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end ){

            int mid =start+(end-start)/2;
            // 4 cases over here
            //1
            if(mid <end && arr[mid]> arr[mid+1]){
                return mid;


            }
            //2
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;


            }
            //3 and 4
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return -1;
    }

     */
    // this will  work on duplicate value
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (start<=end ){

            int mid =start+(end-start)/2;
            // 4 cases over here
            //1
            if(mid <end && nums[mid]> nums[mid+1]){
                return mid;


            }
            //2
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;


            }
            //3 and 4
            // if the element are at start end and middle are equal/ same just skip this duplicates
            if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                //skip the duplicate
                // before skip the duplicate check start is pivot or not
                if(nums[start]>nums[start+1]){
                    return start;
                }
                start++;  // use of this skip  duplicate start element

                if(nums[end]<nums[end-1]){
                    return end-1;
                }
                end--; // use of this skip duplicate end element
            }

            //left side is sorted , so pivot should be in right
            else if(nums[start]<nums[mid] || (nums[start]== nums[mid] &&nums[mid]>nums[end])){
                start = mid+1;
            }else{
                end= mid-1;
            }



        }
        return -1;
    }



}
