package DSA.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr={-8,3,-4,12,5,6};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(mergeSort(arr)));

        //
//        inPlaceMergeSort(arr, 0, arr.length);
//        System.out.println(Arrays.toString(arr));;

    }

    static int[] mergeSort(int[]nums){
        if(nums.length==1){
            return nums;
        }
        int mid = nums.length/2;
        int []left= mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int []right= mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left,right);
    }

    public static int[] merge(int[] first, int[] second) {
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




    // In Place Merge Sort
    /*
    static void inPlaceMergeSort(int[]nums, int start , int end){
        if(end-start==1){
            return;
        }
        int mid =(start+end)/2;
        inPlaceMergeSort(nums, start, mid);
       inPlaceMergeSort(nums, mid, end);

        mergeInPlace(nums,start, mid, end);
    }

    public static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[]mix= new int[end-start];
        int i=start;
        int j=mid;
        int k=0;

        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array is not completed
        //copy the remaining element
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;

        }
        while(j<end){
            mix[k]=arr[j];
            j++;
            k++;

        }
      for( k=0;k< mix.length;k++){ // ans in mix so for copy the ans into original array
          arr[start+k]=mix[k];
      }
    }

     */
}
