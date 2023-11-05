package com.company;

class NegativeRadiusException extends Exception {
    public String toString( ) {
        return " Radius can not be negative";
    }
//    public  String getMessage() {
//
//        return   "Radius can not be negative";
//    }
}


public class CWH_84_Throw_Thows {
    // Thow and Throws difference
    public static double area(int r)  throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r*r;
        return result;
    }



// Example of throws
    public static int  division(int a, int b) throws ArithmeticException{
        int result = a/b;
        // harry function
        return result;
    }
    public static void main(String[] args) {
        // Example of throws
        // shivam uses harry function
        // harry tell that division function can return ArithmeticException
        // so shivan should use try catch block
        try{
            int d = division(4, 0);
            System.out.println(d);

        }catch(Exception e){
            System.out.println("Exception");
        }

        // Thow and Throws difference
        try {
            double ar = area(-6);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
