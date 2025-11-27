package com.DSA.TREE.ST;

public class Main {
    public static void main(String[] args) {
        int[]arr= {3,8,6,7,-2,-8,4,9};
        ST tree= new ST(arr);
        System.out.println(tree.query(1, 6));


    }
}
