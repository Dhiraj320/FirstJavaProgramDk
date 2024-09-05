package com.DSA.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int [] arr= {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));





    }

    static void bubbleSort(int[]nums){
        // run the step n-1 times

        boolean swapped;
        for (int i = 0; i < nums.length; i++){
            swapped = false;
            //for each step, max item will come at last respective index
           // j <= arr.length-1-i; or  j < arr.length-i;  //same
            for (int j = 1; j < nums.length - i; j++){
                //swap if the item is smaller than previous itme
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j]= nums[j-1];
                    nums[j-1]=temp;
                    swapped=true;


                }
            }
            //if you did not swap the particular value of i ,it means the array is sorted hence stop the program
            if(!swapped){
                break;
            }

        }
    }




}
