package com.company;

import java.util.Scanner;

public class CWH_17_relation_operator {
    public static void main(String[] args) {
       // System.out.println("for Logical And...");
//        boolean a = true;
//        boolean b = true;
//        boolean c = false;
//        if (a && b && c){-
//            System.out.println("y");
//        }
//        else{
//            System.out.println("N");
//        }

       // System.out.println("for Logical OR...");
//        boolean a1 = true;
//        boolean b1 = false;
//        if (a1 || b1){
//            System.out.println("y");
//        }
//        else{
//            System.out.println("N");
//        }


 //       System.out.println("for Logical NOT...");

//         boolean a2 = true;
//        boolean b2 = false;
//        System.out.println("Not(a2) is ");
//        System.out.println(!a2);
//        System.out.println("Not(b2) is ");
//        System.out.println(!b2);


        // if else if ladder
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age>56){
            System.out.println("you are experienced");
        }
        else if (age>46){
            System.out.println("you are semi experienced");
        }

        else if (age>36){
            System.out.println("you are semi semi -experienced");
        }

        else{
            System.out.println("you are not experienced");
        }





    }
}
