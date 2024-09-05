package com.DSA.Recursion.Recursion2BasicQuestion;

public class Q1 {
    //print n to 1 number

    public static void main(String[] args) {
        func(5);

    }
    public static void func(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        func(n-1);

    }
}
