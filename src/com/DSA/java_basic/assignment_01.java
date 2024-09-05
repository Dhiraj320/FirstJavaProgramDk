package com.DSA.java_basic;

import java.util.Scanner;

public class assignment_01 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        //1
//        System.out.println("Enter a year");
//        int year = sc.nextInt();
//        if(year%4==0 && year %100 !=0 || year%400==0){
//            System.out.println("Leap year");
//        }else{
//            System.out.println("Not a leap year");
//        }
        //2
//        System.out.println("Enter a number");
//        int number = sc.nextInt();
//        for(int i=1; i<11; i++){
//            System.out.println(number+"*" + i +"=" + number*i);
//        }

        // armstorng number between two number
        //Alogrithm
//        1. Take integer variable Arms.
//        2. Assign a value to the variable.
//        3. Split all digits of Arms.
//        4. Find cube-value of each digit.
//        5. Add all cube-values together.
//        6. Save the output to Sum variable.
//        7. If Sum equals to Arms print Armstrong Number.
//        8. If Sum does not equal to Arms print Not Armstrong Number.
//        int num1, num2;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number ::");
//        num1 = sc.nextInt();
//        System.out.println("Enter the second number ::");
//        num2 = sc.nextInt();
//
//        for (int i = num1; i<num2; i++){
//            int check, rem, sum = 0;
//            check = i;
//            while(check != 0) {
//                rem = check % 10;
//                sum = sum + (rem * rem * rem);
//                check = check / 10;
//            }
//            if(sum == i){
//                System.out.println(""+i+" is an Armstrong number.");
//            }
//        }

        ///3
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
       String  reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }




    }
}
