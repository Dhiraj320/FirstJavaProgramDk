package com.DSA.java_basic;

import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //approach 1

//        int max = a;
//        if(b>max){
//            max =b;
//        }
//        if(c>max){
//            max =c;
//        }
//
//
//
//        System.out.println(max);

        //approach 2

        int max =Math.max(c, Math.max(a, b));
        System.out.println(max);






    }

}
