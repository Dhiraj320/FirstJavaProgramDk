package DSA.linear_search;

import java.util.Arrays;

public class search_in_2d_array {
    public static void main(String[] args) {
        int [][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12, -1},
        };
        int target=34;
        int[] ans=search(arr, target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
        System.out.println(min(arr));

    }

    // search in 2d array
     static int[] search(int[][] arr, int target) {
        if(arr.length ==0){
             return new int[] {-1, -1};
        }
        for(int row =0; row<arr.length; row++) {
            for(int col =0; col<arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[] {row, col}; //why new int[] because we declare  {row, col} but not initialize so we do it

                }
            }
        }

         return new int[] {-1, -1};


    }

    // maximum in 2d array
    static int max(int[][] arr) {
        if(arr.length ==0){
            return -1;
        }
        int max = arr[0][0];
        //or
//        int max = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            for (int element : ints) {

                if (element > max) {
                    max= element;

                }
            }
        }

        return max;


    }
    // minimum in 2d array
    static int min(int[][] arr) {
        if(arr.length ==0){
            return -1;
        }
        int min = arr[0][0];
        //or
//        int max = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            for (int element : ints) {

                if (element < min) {
                    min= element;

                }
            }
        }

        return min;


    }


}
