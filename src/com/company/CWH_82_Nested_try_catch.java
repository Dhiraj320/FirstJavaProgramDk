package com.company;

import java.util.Scanner;

public class CWH_82_Nested_try_catch {
    public static void main(String[] args) {
//        int [] marks = new int[3];
//        marks[0] =7;
//        marks[1] =8;
//        marks[2] =9;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of index");
//        int ind = sc.nextInt();
//        try {
//            System.out.println("Welcome to video no. 82");
//            try {
//                System.out.println(marks[ind]);
//            }catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("Sorry this index is not exist in array");
//                System.out.println("Exception in level 2");
//            }
//        }catch (Exception e){
//            System.out.println("Exception in level 1");
//        }


        //Quick Quiz
        int [] marks = new int[3];
        marks[0] =7;
        marks[1] =8;
        marks[2] =9;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to video no. 82");
                try {
                    System.out.println("The value of array at index is : "  +marks[ind]);
                    flag =false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index is not exist in array");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program");


    }
}
