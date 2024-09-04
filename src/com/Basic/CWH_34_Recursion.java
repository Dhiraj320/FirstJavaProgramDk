package com.Basic;

import java.util.Scanner;

public class CWH_34_Recursion {
    //factorial(0) =1
    //factorial(1) =1


    // factorial (n) = n * n-1 *n-2 * ......1
    //factorial(5)  = 5 * 4 * 3 * 2 * 1 =120
     // formula factorial(n) = n* factorial(n-1)

    // recursive approach
    static int  factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1); //here we go from n to 1

        }

    }
    // Iterative approach
    static int  factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i=1; i<=n; i++){  //1 to n
                product *= i;
            }
            return product ;



        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for find a factorial of it");
        int x = sc.nextInt();
        System.out.println("the value of factorial x is :" + factorial(x));
        System.out.println("the value of factorial x is :" + factorial_iterative(x));

    }
}
