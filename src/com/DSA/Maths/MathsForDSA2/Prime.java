package com.DSA.Maths.MathsForDSA2;

public class Prime {
    public static void main(String[] args) {
        int n=40;
        // here time complexity is O(Sqr(n))
        System.out.println(isPrime(n));// for checking is prime or not
        //this for loop  for getting prime no till 40 or any given n
        // here time complexity is O(n*Sqr(n))
//        for (int i=2;i<=n;i++){
//            System.out.println(i+" " +isPrime(i));
//        }


    }
    public static boolean isPrime(int n) {
        if(n==1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
