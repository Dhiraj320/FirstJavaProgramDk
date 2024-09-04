package com.Basic;

import java.util.Scanner;

public class CWH_06_Exercise {


    public static void main(String[] args) {

//        Scanner scan = new  Scanner(System.in);
//        System.out.println("Enter your Physics marks : ");
//        int physics = scan.nextInt();
//        System.out.println("Enter your Chemistry marks : ");
//        int chemistry = scan.nextInt();
//        System.out.println("Enter your English marks : ");
//        int english = scan.nextInt();
//        System.out.println("Enter your Biology marks : ");
//        int biology = scan.nextInt();
//        System.out.println("Enter your Maths marks : ");
//        int maths = scan.nextInt();
//
//        float percentage = ((physics + chemistry + english + biology + maths )/500.0f)*100;
//
//        System.out.println("percentage : ");
//        System.out.println(percentage);

        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter Your physics marks in range of (1-100)");
        int physics = sc.nextInt();
        System.out.println("Enter your chemistry marks in range of (1-100)");
        int chemistry  = sc.nextInt();
        System.out.println("Enter your maths marks in range of (1-100)");
        int maths  = sc.nextInt();
        System.out.println("Enter your english marks in range of (1-100)");
        int english  = sc.nextInt();
        System.out.println("Enter your hindi marks in range of (1-100)");
        int hindi  = sc.nextInt();

        float percentage = ((physics+chemistry+maths+english+hindi)/500.0f)*100;
        System.out.println("percentage : ");
        System.out.println(percentage);





































    }
}
