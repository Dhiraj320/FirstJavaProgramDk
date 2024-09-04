package com.Basic;

import java.util.Scanner;

public class CWH_78_Error_Exception {
    public static void main(String[] args) {
        //1 Type error Syntax error
        //int a=5;
        //int b=6 // no semicolon // here bulb given so you can resolve it
        //d=4; // not declared data type


        //Logical error
        // write a program to print all prime number between 1 to 10
//        System.out.println(2);
//        for(int i=1; i<5; i++){
//            System.out.println(2*i+1); //here bulb is not given so you can resolve it
//        }        // here it give 9 which is not prime number so it is logical error because here it print odd number


        //RunTime error
        // if you have given esa input or something jo ki program handle na kr paye
        // it produces Arithmetic exception
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "  +1000/k);








        // This handled by Exception handling


    }
}
