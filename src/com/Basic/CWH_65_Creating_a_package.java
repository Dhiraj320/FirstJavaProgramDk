package com.Basic;
// video no. 62 to 64 in vs code JavaProgram folder demonstrate the package

//1 st way to use scanner//import java.util.Scanner;
//2nd st way to use scanner  import java.util.*; // all file get from Scanner Package using .*
// both imports are right and work
public class CWH_65_Creating_a_package {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);// both way right
        java.util.Scanner sc = new java.util.Scanner(System.in); // 3rd way to use  scanner
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input " +a);


    }
}
