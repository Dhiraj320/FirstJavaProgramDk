package com.Basic;

import java.util.Scanner;
// problem 4
class MaxTriesException extends Exception{
    public String toString( ) {
        return "You reached the limit of tries";
    }
//    public  String getMessage() {
//
//        return   "Radius can not be negative";
//    }
}




public class CWH_86_Ch14_PS {
    //Problem 5
    public static void OwnMethod() {
        int marks [] =  {1,2,3,4,5};
        System.out.println("You have an array of marks and \nyou have a max 5 tries to guess the right index");
        Scanner sc = new Scanner(System.in );
        boolean flag = true;
        int index;
        int i=0;
        while(flag && i <5){
            try {
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("You successfully guess the value of marks[index] is " + marks[index]);
                i++;
                break;
            }catch (Exception e){
                System.out.println("Invalid Index");
                i++;
            }

        }
        if(i>=5){
            // problem 4
            try{
                throw new MaxTriesException();

            }catch(MaxTriesException e){
                System.out.println(e.toString());
            }

        }



    }
    public static void main(String[] args) throws MaxTriesException {
        // problem 1
        // syntax error
        //int age =85
        // logical error
        /*
        int age = 78;
        int year_born = 2000-age; // logical error
        System.out.println(year_born);

         */
        // runtime error
     //   System.out.println(6/0);
        // problem 2
      /*
        try{

            int a=666/0;
            System.out.println(a);

        }catch(IllegalArgumentException e){
            System.out.println("hehe");


        }catch (ArithmeticException e){
            System.out.println("haha");
        }


       */

        // problem 3
        /*
        int marks [] =  {1,2,3,4,5};
        System.out.println("You have an array of marks and \nyou have a max 5 tries to guess the right index");
        Scanner sc = new Scanner(System.in );
        boolean flag = true;
        int index;
        int i=0;
        while(flag && i <5){
            try {
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("You successfully guess the value of marks[index] is " + marks[index]);
                i++;
                break;
            }catch (Exception e){
                System.out.println("Invalid Index");
                i++;
            }

        }
        if(i>=5){
            // problem 4
            try{
                throw new MaxTriesException();

            }catch(MaxTriesException e){
                System.out.println(e.toString());
            }

        }

         */

        //Problem 5
        OwnMethod();






    }
}
