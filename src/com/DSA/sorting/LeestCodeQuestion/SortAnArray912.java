package DSA.sorting.LeestCodeQuestion;

import java.util.Arrays;

public class SortAnArray912 {
    public static void main(String[] args) {
        int[]arr={8,3,4,12,5,6};
        arr=sortArray(arr);

        System.out.println(Arrays.toString(sortArray(arr)));

    }

    //USing Quick Sort
    public static int[] sortArray(int[] nums) {


        if(nums.length==1){
            return nums;
        }
        int mid = nums.length/2;
        int []left= sortArray(Arrays.copyOfRange(nums, 0, mid));
        int []right= sortArray(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left,right);

    }

    private static int[] merge(int[] first, int[] second) {

        int[]mix= new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array is not completed
        //copy the remaining element
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;

        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;

        }
        return mix;
    }

}