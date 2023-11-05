package com.company;

import java.util.Scanner;

public class CWH_23_For_loops {
    public static void main(String[] args) {

//        for (int i=1; i<10; i++){
//            System.out.println(i);
//        }

//       int n = 5;
//       for (int  i= 0; i<n; i++){
//           System.out.println(2*i+1);
//       }
        //odd number by user input
//      Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number to print its  first  odd number ");
//        int odd =sc.nextInt();
//        for(int i=0; i<=odd; i++){
//            System.out.println(2*i+1);
//
//    for reverse order odd number
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its  reverse order  odd number ");
        int odd =sc.nextInt();
           for(int i = odd; i >0; i--){
            System.out.println(2*i+1);
        }



        //decrement for loop
        //for(int i=5; i>0; i--){
          //  System.out.println(i);
        //}

        //Quick quiz

//        for(int n = 100; n>0; n--){
//              System.out.println(n);
//            }

        // quick quiz by userInput
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number to get reverse natural number");
//        int n = sc.nextInt();
//        for(int i = n; i >0; i--){
//            System.out.println(i);
//        }



    }
}
