package com.DSA.Recursion.Recursion2BasicQuestion;

public class Q8NumberIsPalindromeOrNot {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));

    }
    //way1
    /*
    static int reverseNumber(int x){
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

    static boolean isPalindrome(int n){

        return n==reverseNumber(n);
    }

     */
    //way 2

    static boolean isPalindrome(int x){
        int count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
        }

        int start=0;

        int end= count;
        while(start<=end){
            if(start==end){
                start++;
                end--;

            }
            return true;

        }
        return false;
    }
}
