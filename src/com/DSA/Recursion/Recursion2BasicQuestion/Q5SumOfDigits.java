package com.DSA.Recursion.Recursion2BasicQuestion;

public class Q5SumOfDigits {
    public static void main(String[] args) {
        int ans = sumOfDigits(1342);
        System.out.println(ans);

    }

    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }



}
