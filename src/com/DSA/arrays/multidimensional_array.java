package DSA.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multidimensional_array {
    public static void main(String[] args) {
//        int [][] arr2D = new int [3][3];
        // or
        /*
        int [][] arr2D = {
                {1,2,3}, //0th index  2-d array
                {4,5},//1st index of 2-d array
                {6,7,8,9}// 2nd index 2-d array
        };
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.toString(arr2D[2]));

         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3*3 array");
        int [][] arr2D = new int [3][3];
        // for input
        for(int row =0; row < arr2D.length ; row++){
            // for each column in every row
            Arrays.setAll(arr2D[row], column -> sc.nextInt());
            //or
//            for (int column =0; column < arr2D[row].length; column++){
//                arr2D[row][column] = sc.nextInt();
//            }

        }
        // for output
        //using for loop
        /*
        for(int row =0; row < arr2D.length ; row++){
            // for each column in every row

            for (int column =0; column < arr2D[row].length; column++){
                System.out.print(arr2D[row][column] + " ");
                //or
                // System.out.println(Arrays.toString(arr2D[row]));

            }
            System.out.println();

        }
        //or
        for(int row =0; row < arr2D.length ; row++){
            // for each column in every row
            System.out.println(Arrays.toString(arr2D[row]));

        }
        System.out.println();
        */


        //OR
        // using enhance for loop

        for (int[] b : arr2D) {
            //int[] b => it is type of 2-D array element
            // because all element are itself an array
            // for each column in every row
            for (int c : b) {
                System.out.print(c + " ");

            }
            System.out.println();

        }
        //or
        for (int[] a : arr2D) {
            // for each column in every row
            System.out.println(Arrays.toString(a));

        }
            System.out.println();









    }
}
