package com.Basic;

import java.util.Scanner;
/// how to weite custom exception
// custom Myexception  class block
class MyException extends Exception {
    public String toString( ) {
        //return super.toString() + "I am to string"; // yha super class ka message b hi show hoga
        return " I am to string"; // me yha nhi chahta ki super class ka message shoe ho to me super keyword ko hta dunga
    }
    public  String getMessage() {
     //   return  super.getMessage() + " I am getMessage"; yha super class ka message b hi show hoga
        return   " I am getMessage"; //me yha nhi chahta ki super class ka message shoe ho to me super keyword ko hta dunga
    }
}
public class CWH_83_Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc =new Scanner(System.in);
        a= sc.nextInt();;
        if(a<9){
            // throw error ko try catch se surround krna padega
            try {
                throw new MyException();
                //throw  new ArithmeticException("This is in built exception");

            }
            // custom error catch block
            catch (MyException e) {
                System.out.println(e.getMessage()); //it is when you  run
                 System.out.println(e.toString()); // it is explicit run
                System.out.println(e);// if not explicit than this is run
                e.printStackTrace();// kon sa error kon si line me aaya  for complex program
                System.out.println("Finished");
            }
            // in built error catch block
//            catch (Exception e) {
//                System.out.println(e.getMessage()); //it is when you  run
//                System.out.println(e.toString()); // it is explicit run
//                System.out.println(e);// if not explicit than this is run
//                e.printStackTrace();// kon sa error kon si line me aaya  for complex program
//                System.out.println("Finished");
//            }
            System.out.println("Yes Finished");
        }


    }
}
