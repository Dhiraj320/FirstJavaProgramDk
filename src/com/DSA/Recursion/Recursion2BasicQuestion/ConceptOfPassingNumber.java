package com.DSA.Recursion.Recursion2BasicQuestion;

public class ConceptOfPassingNumber {

    public static void main(String[] args) {
        concept(5);

    }

    public static void concept(int n) {
        if(n==0){
            return;
        }

        System.out.println(n);
       // concept(n--);// it gives infinite recursion
        concept(--n);
    }
}
