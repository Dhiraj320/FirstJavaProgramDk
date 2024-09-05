package com.DSA.binary_search;

public class order_agnostic_binary_search {
    public static void main(String[] args) {
//        int []arr ={-18,-12,-4, 0,2,3,4,15,16,18,22,45,89}; //Ascending
        int []arr ={89,45,22,18,16,15,4,3,2,0,-4,-12,1-8}; //descending
        int target=22;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);


    }

    static int orderAgnosticBinarySearch(int [] arr, int target){
        int start =0;
        int end =arr.length-1;
        //find whether the array is sorted in ascending or descending
        boolean isAscending;
        if(arr[start]<arr[end]){
            isAscending = true;
        }else{
            isAscending = false;
        }//or
        /*
        boolean isAscending =arr[start]<arr[end];
         */
        while(start<=end){
            //find middle element
            /*int mid = (start+ end) /2;  //might be possible that (start+end) exceeds the range of integer in java
            // so it give the error
             */
            //sor for that the better approach is
            int mid =start+(end-start)/2;
            // it is common condition for both ascending or descending
            if(arr[mid]==target){
                return mid;
            }
            // here isAscending in action

            if(isAscending){
                //for Ascending
                if(target<arr[mid]){
                    end = mid-1;

                }else {
                    start = mid+1;
                }

            }else{
                //for descending
                if(target>arr[mid]){
                    end = mid-1;

                }else {
                    start = mid+1;
                }
            }

            // if any of them if else condition true then element not found

        }
        return -1;



    }




}
