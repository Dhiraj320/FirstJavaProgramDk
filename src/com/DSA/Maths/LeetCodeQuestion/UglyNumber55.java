package com.DSA.Maths.LeetCodeQuestion;

public class UglyNumber55 {
    public static void main(String[] args) {
        System.out.println(isUgly(30));

    }
    public static boolean isUgly(int n) {
        while(n>1){
            if(n%2==0){
                n=n/2;
            }else if(n%3==0){
                n=n/3;
            }else if(n%5==0){
                n=n/5;
            }else{
                return false;
            }
        }
        if(n==1){
            return true;
        }
        return false;

    }
}
