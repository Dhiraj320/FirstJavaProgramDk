package com.DSA.BigIntegerAndBigDecimal;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int num){
        BigInteger factorial = new BigInteger("1");
        for(int i=2; i<=num;i++){
            factorial=factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;

    }
    public static void main(String[] args) {
        System.out.println(Factorial.factorial(100));

    }
}
