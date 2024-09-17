package com.DSA.BigIntegerAndBigDecimal;

import java.math.BigDecimal;

public class bigDecimal {
    public static void main(String[] args) {
        BD();

    }

    static void BD(){
        double x=0.03;
        double y=0.04;
        System.out.println(y-x);// it gives some error


        BigDecimal X= new BigDecimal("0.03");
        BigDecimal Y= new BigDecimal("0.04");
        System.out.println(Y.subtract(X)); // it gives exact answer

        BigDecimal a= new BigDecimal("5455656626465.0146646263");
        BigDecimal b= new BigDecimal("4445565262620.5646564603");
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.add(b));
        System.out.println(a.pow(2));
        System.out.println(a.negate());



    }
}
