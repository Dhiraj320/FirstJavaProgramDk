package com.DSA.arrays;

public class array_lecture_2_1 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        increament(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"");
        }

    }
    public static void increament(int[] a) {
        for(int i = 0; i<a.length; i++){
            a[i]=a[i]+1;

        }


    }
}
