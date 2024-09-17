package com.DSA.BigIntegerAndBigDecimal;

import java.math.BigInteger;

public class bigInteger {
    public static void main(String[] args) {
        // primitive data type
        int a= 2145595755;
        int b=2145578252;
        System.out.println(a+b);// output -3793289 // addition not possible of big value
        // BigInteger data type
        BigInteger A = BigInteger.valueOf(2145595755);
//        BigInteger A = BigInteger.valueOf(2145593151225755); // Not possible that s why "565465652162562965"
        BigInteger B = BigInteger.valueOf(2145578252);
        // Addition of two BigInteger
        System.out.println(A.add(B));// output 4291174007 // addition possible of big value

        BigInteger C = new BigInteger("55565635856451558556565256518512515151");
        BigInteger D = new BigInteger("35656464598461555162626566266266658566");
        System.out.println(C.multiply(D));
        System.out.println(C.subtract(D));
        System.out.println(C.divide(D));
        System.out.println(C.remainder(D));
        if(C.compareTo(D)<0){
            System.out.println("YEs");
        }else{
            System.out.println("No");
        }

    }
}
