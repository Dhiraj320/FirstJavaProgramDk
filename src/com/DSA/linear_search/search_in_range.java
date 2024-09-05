package com.DSA.linear_search;

public class search_in_range {
    public static void main(String[] args) {
        int [] nums={2,4,4,5,8,6,879,2,5,3,-3,-5,-1};
        int targetValue =879;
        int ans = linearSearch(nums ,targetValue,3,9);
        System.out.println(ans);
        int ans2 = linearSearch2(nums ,targetValue,3,9);
        System.out.println(ans2);

    }
    // search the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int []arr , int target, int start , int end){
        if(arr.length == 0) {
            return -1;
        }
        for(int index = start; index <=end; index++){
            // check for element at every index if it is  =target
            int element =arr[index];
            if(element == target) {
                return index;
            }
        }

        // this line will execute if none of the return statement above executed
        // hence target not found

        return Integer.MAX_VALUE;

    }
    // search the array: return the element if item found
    //otherwise if item not found return -1
    static int linearSearch2(int []arr , int target, int start , int end){
        if(arr.length == 0) {
            return -1;
        }
        for(int index = start; index <=end; index++){
            // check for element at every index if it is  =target
            int element =arr[index];
            if(element == target) {
                return element;
            }
        }

        // this line will execute if none of the return statement above executed
        // hence target not found

        return Integer.MAX_VALUE;

    }
}
