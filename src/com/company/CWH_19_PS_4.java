package com.company;

import java.util.Scanner;

//import java.util.Scanner;
public class CWH_19_PS_4 {
    public static void main(String[] args) {

        //Question1
        // question is not right because = this is for assign not for equality
               int a = 10;
               if(a==11) {
                   System.out.println("I am 11");
               }else{
                   System.out.println(("I am not 11"));

                   }





        //Question2
//        byte m1,m2,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your marks in physics");
//        m1 = sc.nextByte();
//        System.out.println("enter your marks in chemistry");
//        m2 = sc.nextByte();
//        System.out.println("enter your marks in maths");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("your overall percentage is: " + avg );
//        if(avg>=40 && m1>=33 && m1>=33 && m1>=33 ){
//            System.out.println("congratulation , You have been promoted");
//        }
//        else{
//            System.out.println("sorry You have been not promoted!");
//          }

        //Question3
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income in lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();


        // it is wrong again solve
        if (income<=2.5){
            tax = tax  + 0;
        }
        else if (income>2.5f &&  income<=5f){
            tax = tax  + 0.05f * (income - 2.5f);
        }
        else if (income>5.0f &&  income<=7.5f){
            tax = tax  + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.1f*(income-2.50f);
        }
        else if (income>7.5f &&  income<=10.0f){
            tax = tax  + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.1f*(7.5f-5.0f);
            tax = tax +0.15f*(income-7.5f);
        }
        else if (income>10.0f &&  income<=12.5f){
            tax = tax  + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.1f*(7.5f-5.0f);
            tax = tax +0.15f*(10.0f-7.5f);
            tax =tax +0.2f*(income-10.0f);
        }
        else if (income>12.5f &&  income<=15f){
            tax = tax  + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.1f*(7.5f-5.0f);
            tax = tax +0.15f*(10.f-7.5f);
            tax =tax +0.2f*(12.5f-10.0f);
            tax = tax+0.25f*(income-12.5f);
        }
        else if (income>15f){
            tax = tax  + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.1f*(7.5f-5.0f);
            tax = tax +0.15f*(10.f-7.5f);
            tax =tax +0.2f*(12.5f-10.0f);
            tax = tax+0.25f*(15.0f-12.5f);
            tax = tax+0.30f*(income-15f);
        }
        System.out.println("the  total tax paid by the employee is " + tax);



//
//        if (income<=2.5){
//            tax = tax  + 0;
//        }
//        else if (income>2.5f &&  income<=5f){
//            tax = tax  + 0.05f * (income - 2.5f);
//        }
//        else if (income>5.0f && income <=10f){
//            tax = tax  + 0.05f*(5f - 2.5f);
//            tax = tax  + 0.2f*(income - 5f);
//        }
//            else if (income>10f){
//            tax = tax  + 0.05f*(5f - 2.5f);
//            tax = tax  + 0.2f*(10f - 5f);
//            tax = tax  + 0.3f*(income - 10f);
//        }
//            System.out.println("the  total tax paid by the employee is " + tax);

        //Question 4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a day numbe (1-7)");
//
//        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//        }

        //Question 5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a year");
//        int year = sc.nextInt();
//        if(year%4==0 && year%400==0){
//            System.out.println("Its a leap year");
//        }
//        else{
//            System.out.println("not a leap year");
//        }



        // Question6
        //Scanner sc = new Scanner(System.in);
        //String website = sc.next();
        //if(website.endsWith(".org")){
          //  System.out.println("this is  a organizational website");
        //}
        //else if(website.endsWith(".com")){
          //  System.out.println("this is  an commercial website");
        //}
          //  else if(website.endsWith(".in")){
            //System.out.println("this is  an indian website");
        //}








        }

    }

