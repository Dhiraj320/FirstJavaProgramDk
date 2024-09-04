package DSA.Recursion.Recursion3PatternAndSortingQuestion;

import java.util.Arrays;

public class Q1Pattern {
    public static void main(String[] args) {
//        Pattern1(4, 0);
//        Pattern2(4, 0);
        int[] arr={4,3,2,1};
//        bubbleSort(arr, arr.length-1, 0);
//
//        System.out.println(Arrays.toString(arr));
        selectionSort(arr, arr.length, 0,0);

        System.out.println(Arrays.toString(arr));


    }
    /*
     ****
     ***
     **
     *
     *
    public static void Pattern1(int row, int column) {
        if (row == 0) {
            return;
        }
        if (column < row) {
            System.out.print("*");
            Pattern1(row, column + 1);
        }else{
            System.out.println();
            Pattern1(row-1, 0);
        }
    }

     */
    //Pattern 2
    public static void Pattern2(int row, int column) {
        if (row == 0) {
            return;
        }
        if (column < row) {

            Pattern2(row, column + 1);
            System.out.print("*");
        }else{

            Pattern2(row-1, 0);
            System.out.println();
        }
    }

    //BubbleSort
    public static void bubbleSort(int[]arr,int row, int column) {
        if (row == 0) {
            return;
        }
        if (column < row) {
            //swap
            if(arr[column]>arr[column+1]){
                int temp =arr[column];
                arr[column] = arr[column+1];
                arr[column+1]=temp;
            }


            bubbleSort(arr,row, column + 1);
        }else{

            bubbleSort(arr,row-1, 0);
        }
    }

    public static void selectionSort(int[]arr,int row, int column, int max) {
        if (row == 0) {
            return;
        }
        if (column < row) {
            if(arr[column]>arr[max]){
                selectionSort(arr, row, column+1, column);

            }else{
                selectionSort(arr, row, column+1, max);
            }
        }else{
            int temp=arr[max];
            arr[max]=arr[row-1];
            arr[row-1]=temp;

            selectionSort(arr,row-1, 0,0);
        }
    }
}
