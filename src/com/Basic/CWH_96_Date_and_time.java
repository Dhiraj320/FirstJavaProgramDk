package com.Basic;

public class CWH_96_Date_and_time {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis() + " Milliseconds");
//        System.out.println(System.currentTimeMillis()/1000 + " Seconds");
//        System.out.println(System.currentTimeMillis()/1000/3600 + " Minutes");
//        System.out.println(System.currentTimeMillis()/1000/3600/24 + " Hours");
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365 + " Years");


        // it give 53 year from 1970

        // is It safe to store  millisecond in long
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis() + " Milliseconds");
        // yes it is safe because we have 1000000 milisecond remaining
        }
}
