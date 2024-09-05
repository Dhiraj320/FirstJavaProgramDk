package com.DSA.java_basic;

import java.util.Arrays;

public class Function {
    public static void main(String[] args) {
//     int ans =  sum(5,6);
//        System.out.println(ans);

//        int num1=20;
//        int num2=10;
//        swap(num1,num2);
        varags(2,3,4,5,6);
        for(int i=100; i<=999; i++){
            if(isAromstorng(i)){
                System.out.print(i + " ");
            }
        }






    }

//    static int sum(int a , int b ) {
//        return a+b;
//
//
//     }

//     static void swap (int num1, int num2){
//        int temp =num1;
//         num1=num2;
//         num2= temp;
//         System.out.println("Value of num1 is " + num1
//                 + " and Value of num2 is " + num2);
//
//
//     }

     static void varags(int ...v){
         System.out.println(Arrays.toString(v));
     }

     static boolean isAromstorng(int n){
        int original = n;
        int sum= 0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            sum = sum + rem *rem*rem;
        }
        return  sum == original;





     }




}
