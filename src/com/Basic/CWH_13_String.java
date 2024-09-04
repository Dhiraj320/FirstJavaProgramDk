package com.Basic;
import java.util.Scanner;
public class CWH_13_String {
    public static void main(String[] args) {
        //  1 )way of writing String;
//         String name = new String("Dhiraj");
        // 2)way of writing String;
//         String name = "Dhiraj";
//         System.out.print("The name is ");  // Println me ln means space create krna hota hai
//         System.out.println(name);

//         int a = 6;
//        float b = 5.6456f;
//         System.out.printf("The value of a is %d and value of b is %.2f", a, b); // .2 means upto two decimal and
//        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);  // 8.2 mean upto 8 space after 2 digit of decimal
//        System.out.format("The value of a is %d and value of b is %f", a, b);

        Scanner sc  = new Scanner (System.in);
        //String st = sc.next();  // Agar ek word chahiye to next and agar sare word chahiye to nextline use krte hai
        String st = sc.nextLine();
        System.out.println(st);





    }
}
