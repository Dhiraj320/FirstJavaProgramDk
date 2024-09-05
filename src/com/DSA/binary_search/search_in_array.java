package com.DSA.binary_search;

public class search_in_array {
    public static void main(String[] args) {
        //ascending order sorted array
        int []arr ={-1,0,3,5,9,12};
        int target=9;
        int ans = binarySearchAscending(arr, target);
        System.out.println(ans);
        //descending order sorted array
        int []arr2 ={89,45,22,18,16,15,4,3,2,0,-4,-12,1-8};
        int target2=22;
        int ans2 = binarySearchDescending(arr2, target2);
        System.out.println(ans2);



    }

    // search the array: return the index if item found
    //otherwise if item not found return -1

    static int binarySearchAscending(int []arr, int target){
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            //find middle element
            /*int mid = (start+ end) /2;  //might be possible that (start+end) exceeds the range of integer in java
            // so it give the error
             */
            //so for that the better approach is
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


    // search the array: return the index if item found
    //otherwise if item not found return -1

    static int binarySearchDescending(int []arr, int target){
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            //find middle element
            /*int mid = (start+ end) /2;  //might be possible that (start+end) exceeds the range of integer in java
            // so it give the error
             */
            //sor for that the better approach is
            int mid =start+(end-start)/2;
            if(target<arr[mid]){
                start = mid+1;


            }else if(target>arr[mid]){

                end = mid-1;
            }else{
                return mid;
            }
            // if any of them if else condition true then element not found

        }
        return -1;



    }
}
