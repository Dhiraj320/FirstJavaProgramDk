package com.company;

public class CWH_09_Associativity_Precedence {
    public static void main(String[] args) {
        // Precedence & Associativity
        //int a = 6*5-34/2;
        /*
        highest precedence goes to * and /. They are then evaluated on the basis of
        left to right associativity
            = 30-34/2
            = 30-17
            = 13
         */
        //int b = 60/5-34*2;
//                = 12-34*2
//                = 12-68
//                = -56
       // System.out.println(a);
       // System.out.println(b);



        //Quick Quiz

//        float x = 6.5f;
//        float y = 1.5f;
//        float k = x * y/2;
//        System.out.println(k);

        float a = 10.f;
        float b = 5.f;
        float c = 4.f;
        float k = (b*b) -(4*a*c)/(2*a);
        System.out.println(k);
//
//        float v = 8.5f;
//        float u = 5.2f;
//        float k = v*v - u*u;
//        System.out.println(k);

        //int a = 5;
        //int b = 6;
        //int d = 12;
        //int k = a*b - d;
        //System.out.println(k);










    }
}
