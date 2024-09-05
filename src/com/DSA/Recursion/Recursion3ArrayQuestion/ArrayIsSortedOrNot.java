package com.DSA.Recursion.Recursion3ArrayQuestion;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[]arr={1,2,3,14,5};

        System.out.println(isSorted(arr, 0,14));

    }
    //way1 to represent
/*
    static boolean isSorted(int []arr){
        int index=0;
        return helper(arr, index);
    }

    public static boolean helper(int[] arr, int index) {
        if(index==arr.length-1) {
            return true;
        };
        return arr[index]<arr[index+1] &&helper(arr, index+1);
    }
    */

    //way2 to represent

    public static boolean isSorted(int[] arr, int index, int target) {
        if(index==arr.length-1) {
            return true;
        };
        return arr[index]<arr[index+1] &&isSorted(arr, target,index+1);
    }
}
