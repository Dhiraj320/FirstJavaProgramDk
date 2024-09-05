package com.DSA.Recursion.Recursion2BasicQuestion;

public class Q2 {
    public static void main(String[] args) {
//        func(5);
        funBoth(5);

    }
    //print n to 1 number

    static void func(int n){
        if(n==0){
            return;
        }

        func(n-1);
        System.out.println(n);
    }



    //print n to 1 number and 1 to n both
    static void funBoth(int n){
        if(n==0){
            return;

        }
        System.out.print(n);
        funBoth(n-1);
        System.out.print(n);
    }
}
