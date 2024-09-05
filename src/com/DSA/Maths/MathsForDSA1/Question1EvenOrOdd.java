package com.DSA.Maths.MathsForDSA1;
//Bitwise Operator
public class Question1EvenOrOdd {
    public static void main(String[] args) {
        int n =24;
        System.out.println(isOdd(n));
    }
    public static boolean  isOdd(int n) {
        return (n&1)==1;
    }

}
