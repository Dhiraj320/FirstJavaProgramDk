package com.company;

import java.util.Scanner;

public class CWH_22_do_while_loop {
    public static void main(String[] args) {
//        int a= 0;
//        while (a<0){
//            System.out.println(a);
//            a++;
//        }
//
//        int b=0;
//        do{
//            System.out.println(b);
//            b++;
//        }while (b<0);


     //Quiz
//        int d=0;
//        do{
//            System.out.println(d);
//            d++;
//        }while(d<100);
        //by user input
        int j=1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int c =sc.nextInt();
        sc.close();
        do {
            System.out.println(j);
            j++;
        }while (j<=c);
  }
}
