package com.DSA.OOPs.OOps6.lambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i+1);
            
        }
        //
        numbers.forEach((item)-> System.out.println(item*2));// forEach taking form Consumer Interface
        // System.out.println(item*2)); :this contain body of the function
        // numbers.forEach((item)// this contains, parameter of the function
        //
        //directly do with consumer
        Consumer<Integer> fun=(item)->System.out.println(item*2);
        numbers.forEach(fun);







        

    }

    interface Operation{
        int operation (int a, int b);

    }

   

}
