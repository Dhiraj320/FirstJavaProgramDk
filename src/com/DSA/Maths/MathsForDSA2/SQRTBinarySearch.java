package com.DSA.Maths.MathsForDSA2;

public class SQRTBinarySearch {
    public static void main(String[] args) {
        int n=40;
        int p =3; // p= precision
        System.out.printf("%.3f",sqrtBinarySearch(n, p));

    }
    static double sqrtBinarySearch(int n, int p) {
        int start = 0;
        int end = n;
        double ans=0;

        while (start <= end) {
            int mid= start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid>n){
                end= mid-1;
            }else{
                start = mid+1;
            }

        }
        double inc=0.1;

        for(int i=0; i<p;i++){
            while(ans*ans<=n){
                ans+=inc;
            }
            ans-=inc;
            inc/=10;
        }
        return ans;



    }


}
