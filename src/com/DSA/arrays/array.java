package com.DSA.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        for array of primitive

        System.out.println("Enter the size of array");
        int n = sc.nextInt();



        int[] arr = new int[n];
        //taking input
        System.out.println("Enter the all no of array size you enter");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        // for print
        System.out.println("You entered all this no. ");

        System.out.println(Arrays.toString(arr));
        //or
//        for (int j : arr) {  // for every element in array , print the element
//            System.out.println(j + " "); ///here j represent element of the array
//        }

         */

        /*
        // for array of primitive

        String [] str = new String[4];
        for (int i = 0; i < str.length; i++){
            str[i] = sc.next();

        }
        System.out.println(Arrays.toString(str));
        // modify element
        str[0] ="Hello";
        System.out.println(Arrays.toString(str));


         */

        // passing function in array

        int[] num = {3, 5, 69 ,85};
        System.out.println(Arrays.toString(num));

        // change the value of arr[0]
        change(num);
        System.out.println(Arrays.toString(num));













    }

    static void change (int [] arr){

        arr[0] =90;
    }
}
