package com.DSA.String.StringBuffer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class StringBufferLecture {
    public static void main(String[] args) {
        /* // StringBuffer
        // Constructor type 1
        StringBuffer sb1= new StringBuffer();
        sb1.append("WeMakeDevs");
        sb1.append(" is nice!");// it's not create object it modify
//        sb1.insert(2, " Rahul");
        sb1.replace(1, 5, "Dhiraj"); // end is exclusive
        sb1.delete(1, 5); // end is exclusive
        sb1.reverse();
        String st= sb1.toString();
        System.out.println(st);
        // Constructor type 2 passer String in it or
        StringBuffer sb2= new StringBuffer("Hello World");
        // Constructor type 3 passed some capacity initially
        StringBuffer sb3= new StringBuffer(30);
        System.out.println(sb3.capacity());
        */
        // method available in String
        //1)// remove white spaces
        String sentence="he is good boy but bad habit";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll(" ","" ));
        //2) split
        String arr="Dhiraj Sawan Ranu boy";
        String []names=arr.split(" ");
        System.out.println(Arrays.toString(names));
        // Format related stuff
        DecimalFormat df=new DecimalFormat("0.000");
        System.out.println(df.format(7.2)); // after7.2 it append after . zero







    }
}
