package com.DSA.Recursion.RecursionQuestion4Strings.Subsequence4_1;

public class Q2SkipString {
    public static void main(String[] args) {
        //System.out.println(skipString("beapplecd"));
        System.out.println(skipStringAppNotApple("beapplcd"));

    }
    static String skipString(String up){
        if(up.isEmpty()){
            return "";

        }
        if(up.startsWith("apple")){
            return skipString(up.substring(5));
        }else{
            return up.charAt(0)+skipString(up.substring(1));

        }

    }

    //

    static String skipStringAppNotApple(String up){
        if(up.isEmpty()){
            return "";

        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipStringAppNotApple(up.substring(3));
        }else{
            return up.charAt(0)+skipStringAppNotApple(up.substring(1));

        }

    }
}
