package com.DSA.Recursion.RecursionQuestion4Strings.Subsequence4_1;

import java.util.ArrayList;

public class Q4SubSetOrSubSequence {
    public static void main(String[] args) {
        subSequence("", "abc");

    }

    static  void subSequence(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+ " ");
            return;
        }
        char ch= up.charAt(0);

        subSequence(p+ch, up.substring(1));//taking element
        subSequence(p,up.substring(1));//Ignore element

    }

    static ArrayList<String> subSequenceReturningArrayList(String p, String up){
        ArrayList<String> list = new ArrayList<String>();
        if(up.isEmpty()){
            System.out.print(p);
            return list;
        }
        char ch = up.charAt(0);




        ArrayList<String> left=  subSequenceReturningArrayList(p+ch, up.substring(1));
        ArrayList<String> right=  subSequenceReturningArrayList(p+ch, up.substring(1));
        left.addAll(right);
        return list;

    }
}
