package com.company;

import java.util.Scanner;

class InvalidInputException extends Exception {
    public String toString(){
        return "Can not add & with any number ";
    }
}
class CanNotDivideByZeroException extends Exception {
    public String toString(){
        return "Can not divide by 0";
    }
}
class MaxInputException extends Exception {
    public String toString(){
        return "Input can not be greater than 100000";
    }
}
class MaxMultiplyException extends Exception {
    public String toString(){
        return "Input can not be greater than 7000 while multiplying";
    }
}
class CustomCalculator {
    double  add(double a , double b)throws InvalidInputException ,MaxInputException  {
        if(a>=100000 || b ==100000){
            throw new MaxInputException();

        }
        if(a=='&' || b =='&'){
            throw new InvalidInputException();
        }

        return a+b;
    }
    double  sub(double a , double b) throws MaxInputException {
        if(a>=100000 || b ==100000){
            throw new MaxInputException();

        }
        return a-b;
    }
    double  mul(double a , double b) throws MaxMultiplyException, MaxInputException {
        if(a>=100000 || b ==100000){
            throw new MaxInputException();

        }
        if(a>7000 || b>7000){
            throw new MaxMultiplyException();
        }
        return a*b;
    }
    double  div(double a , double b) throws CanNotDivideByZeroException, MaxInputException {
        if(a>=100000 || b ==100000){
            throw new MaxInputException();

        }
        if(b==0){
            throw  new CanNotDivideByZeroException();
        }
        return a/b;
    }


}
public class CWH_87_Ex6 {
    public static void main(String[] args) throws InvalidInputException, CanNotDivideByZeroException, MaxInputException, MaxMultiplyException {
        //Calculator
        /*
        You have to create a custom calculator  with following operation which thow the following exceptions
        1  + --> Addition
        1  - --> Addition
        1  * --> Addition
        1  / --> Addition
        which thows following  exception
        1. Inavild Input Exception ex. 8 & 9
        2.Cannot divide by 0 exception
        3.Max Input Exception if any of the input is graeter than 100000
        4. Max Multiplier Reached Exception  - Don't allow any multiplication input to be greater than 7000
         */

        CustomCalculator cc = new CustomCalculator();
      //  System.out.println(cc.add(1000, 500));
       // System.out.println(cc.add(10000,100000));
       // System.out.println(cc.add(8, '&'));
        System.out.println(cc.sub(100000, 100));
    }
}
