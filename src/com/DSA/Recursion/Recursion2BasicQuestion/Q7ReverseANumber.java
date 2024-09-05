package com.DSA.Recursion.Recursion2BasicQuestion;

public class Q7ReverseANumber {
    public static void main(String[] args) {
//        reverseNumber(1342);
//        System.out.println(sum);
        System.out.println(reverseNumber2(-1234));



    }
    //way 1
//    static int sum=0;
//    static void reverseNumber(int n){
//        if(n==0){
//            return;
//        }
//        int remainder =n%10;
//        sum=sum*10+remainder;
//        reverseNumber(n/10);
//    }

    //way 2
    static int reverseNumber2(int x){
        if(x<0){
            return 0;
        }
        int ans= (int) Math.log10(x);


        int digits=ans+1;

        return helper(x,digits);


    }

    public static int helper(int x, int digits) {
        if(x%10==x){
            return x;
        }

        int rem =x%10;
        return rem*(int)(Math.pow(10, digits-1))+helper(x/10,digits-1);
    }

}
