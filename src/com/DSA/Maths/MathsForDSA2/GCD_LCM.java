package com.DSA.Maths.MathsForDSA2;

import java.util.Arrays;

public class GCD_LCM {
    public static void main(String[] args) {

//        System.out.println(gcd(105,224));
//        System.out.println(lcm(9,18));
        String []a={"Mary","John","Emma"};
        int[] heights={180,165,170};
        System.out.println(Arrays.toString(sortPeople(a, heights)));




    }
    public static String[] sortPeople(String[] names, int[] heights) {
        String[]result= new String[names.length];

        for(int i=0; i<names.length;i++){
            int maxHeight= Integer.MIN_VALUE;
            for(int j: heights){
                maxHeight= Math.max(maxHeight, j);
            }
            for(int j=0;j<names.length;j++){
                if(heights[j]==maxHeight){
                    heights[j]=-1; // reassign the height value at j ;
                    result[i]=names[j];
                    break;
                }
            }
        }
        return result;


    }





//    static int gcd(int a, int b){
//        if(a==0){ // base condition
//            return b;
//        }
//         return gcd(b%a, a);
//    }
//    static int lcm(int a, int b) {
//        return a*b/gcd(a,b);
//
//
//    }
}
