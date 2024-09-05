package com.DSA.Maths.MathsForDSA1;

public class Question2and3FindUnique {
    public static void main(String[] args) {
//        int[]arr={2,3,4,1,2,1,3,6,4};// for positive no finding unique
//        System.out.println(unique(arr));
        int[]arr={-2,3,2,4,-5,5,-4};// for negative as well as positive no finding unique
        System.out.println(uniqueForNegative(arr));
    }

    //Q2
    public static int unique(int[]arr){
        int unique = 0;
        for (int n:arr
             ) {
            unique ^= n;

        }


        return unique;

    }
    //Q3
    public static int uniqueForNegative(int[]arr){
        int unique = 0;
        for (int n:arr
        ) {
            unique += n;

        }


        return unique;

    }
}
