package com.Basic;

import java.util.Scanner;

public class CWH_81_Handling_exception {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] =7;
        marks[1] =8;
        marks[2] =9;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind =sc.nextInt();
        System.out.println("Enter the number you want to divide value with");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index is : " +marks[ind]);
            System.out.println("The value of array= value/number  is : " +marks[ind]/number);

        }catch (ArithmeticException e){
            System.out.println("ArithmeticException error occurred");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException error occurred");

        }catch (Exception e){
            System.out.println("Some other error occurred");

        }
    }
}
