package com.DSA.String.StringBuffer;

import java.util.Random;

public class GenerateRandomString {
    static  String generateRandomString(int size){
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i=0;i<size; i++){
            int randomChar= 97+ (int)(random.nextFloat()*26);
            sb.append((char)randomChar);
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        int n= 20;
        String name= generateRandomString(n);
        System.out.println(name);


    }
}
