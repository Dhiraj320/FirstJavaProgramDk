package com.Basic;

import java.util.*;


public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
//        float a = sc.nextFloat();

        System.out.println("Enter number 2");
        int b = sc.nextInt();
//        float b = sc.nextFloat();
        int sum = a+b;

//        float sum = a+b;
        System.out.println("The sum of these number is");
        System.out.println(sum);
        System.out.println("enter b1");
        String b1 = sc.next();  //for only word read
        System.out.println(b1);
        System.out.println("enter b2");
        String b2 = sc.nextLine(); //for full length word
        System.out.println(b2);



       // System.out.println(b1);


    }
}
