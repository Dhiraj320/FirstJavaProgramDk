package com.DSA.Maths.LeetCodeQuestion;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/description/
public class FlippingAnImage832 {
    public static void main(String[] args) {
        int [][]image = {
                         {1,1,0},
                         {1,0,1},
                         {0,0,0}
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int [] row : image){
            // reverse the array
            for(int i = 0; i < (image[0].length+1)/2;i++){
                //swap
                int a= row[image[0].length-i-1];
                int temp = row[i]^1;
                row[i] =a^1;
                a=temp;
            }

        }
        return image;

    }

}
