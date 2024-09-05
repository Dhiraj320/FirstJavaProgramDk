package com.DSA.Recursion.Recursion2BasicQuestion;

public class Q4SumOfN {
    public static void main(String[] args) {
        int sum = sum(5);
        System.out.println("Sum is "  + sum);

    }

    static int sum(int n){

        if(n==1){
            return 1;
        }
         return n+sum(n-1);
    }
}
