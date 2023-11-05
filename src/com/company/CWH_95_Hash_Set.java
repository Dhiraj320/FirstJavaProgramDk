package com.company;

import java.util.HashSet;

public class CWH_95_Hash_Set {
    public static void main(String[] args) {
//        HashSet<Integer> hs = new HashSet<Integer>();
//        HashSet<Integer> hs = new HashSet<Integer>(6);
        HashSet<Integer> hs = new HashSet<Integer>(6, 0.85f);
        hs.add(25);
        hs.add(8);
        hs.add(100);
        hs.add(75);
        hs.add(125);
        hs.add(75); // it not give repeated value
        System.out.println(hs);


    }
}
