package com.DSA.OOPs.OOps6.lambdaFunctions;

public class Calculatorusinglambda {
    public static void main(String[] args) {
    Operation sum =(a, b)-> a+b;// the body of abstract method or interface method
     Operation minus =(a, b)-> a-b;
     Operation multiply =(a, b)-> a*b;
      Operation divide =(a, b)-> a/b;
       Operation modulus =(a, b)-> a%b;
        Calculatorusinglambda myCalculator = new Calculatorusinglambda();
        System.out.println(myCalculator.operate(5, 6, sum));
        System.out.println(myCalculator.operate(5, 6, minus));
        System.out.println(myCalculator.operate(5, 6, multiply));
        System.out.println(myCalculator.operate(5, 6, divide));
        System.out.println(myCalculator.operate(5, 6, modulus));




    }
    private int operate(int a, int b, Operation op){
        return op.operation(a,b);

    }

}

interface Operation{
    int operation (int a, int b);// abstract method or interface method

}
