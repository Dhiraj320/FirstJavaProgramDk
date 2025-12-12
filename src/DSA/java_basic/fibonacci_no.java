package DSA.java_basic;

import java.util.Scanner;

public class fibonacci_no {
    public static void main(String[] args) {
//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of Fibonacci no.");
        int n= sc.nextInt();
        int a =0;
        int b =1;
        int count =2;


        while(count<=n){

            int temp = b;
            b = b + a;
            a =temp;
            count++;



        }
        System.out.println("The fibonacci no. is " + b);

//       Recursion Approach
//        int n = 6;
//        System.out.println(
//                n + "th Fibonacci Number: " + fib(n));

//Iterative Approach
//        int n = 9;
//        System.out.println(fib(n));





    }


//    Recursion Approach
//    static int fib(int n)
//    {
//        if (n <= 1)
//            return n;
//        return fib(n - 1) + fib(n - 2);
//    }

    //Iterative Approach
//    static int fib(int n)
//    {
//        int a = 0, b = 1, c;
//        if (n == 0)
//            return a;
//        for (int i = 2; i <= n; i++) {
//            c = a + b;
//            a = b;
//            b = c;
//        }
//        return b;
//    }
}
