package com.Basic;

import java.util.Scanner;

public class CWH_35_PS_7 {


// Question 1
    static Scanner sc = new Scanner(System.in);
//    static void table ( ){
//        System.out.println("Enter a number of table to print");
//        int n= sc.nextInt();
//        int i;
//        for(i=1; i<=10; i++){
//            System.out.printf("%d X %d = %d\n", n, i, n*i );
//        }
//
//    }

    // Question 2
//    static void patter1 (int n){
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
    //OR
    /*

      static void pattern1 (int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
*/

    // Qurestion 3
  /*  static int sumRecursion(int n){
        // base condition
        if(n==1){
            return 1;
        }else{
            return n + sumRecursion(n-1);
        }

    }

   */

    // Question 4
   /*     static void pattern2 (int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    */

    // Question5

    //Fibonacci Series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 38,
    /*static int fib(int n){


        if(n == 1){
            return 0;
        }else if(n==2){
            return 1;
        }
        //OR
//        if(n==1 || n ==2){
//            return n-1;
//        }

        else{
            return fib(n-1)+ fib(n-2);
        }
    }


     */


    // Question 6
//    static int average(int ...arr){
//        int result  = 0;
//        int d=0;
//        int c = arr.length;
//        for (int a: arr){
//            result += a;
//            d =result/c;
//
//        }
//        return d;
//
//    }

    //Question 7
//    static int pattern2_rec(int n) {
//        if(n>0){
//
//            for(int i=n; i>0; i--){
//                System.out.print("*");
//            }
//            System.out.println();
//            pattern2_rec(n-1);
//        }
//        return n;
//    }
   // Question 8
//   static int pattern1_rec (int n) {
//
//       if (n > 0) {
//           pattern1_rec(n-1);
//           for (int i = 0; i > n; i++) {
//               System.out.print("*");
//           }
//           System.out.println("");
//       }
//       return n;
//   }

    //Question 9
//    static float CeltoFer(float n){
//        float fer = (n *9/5+32);
//        return fer;
//    }
//
    // Question 10
//    static int sumIterative(int n){
//        // base condition
//        if(n==1){
//            return 1;
//        }else{
//            int sum  = 0;
//            for (int i=0; i<=n; i++){  //1 to n
//                sum += i;
//            }
//            return sum;
//        }
//
//    }







    public static void main(String[] args) {
//        table();
//        pattern1(4);
 //       System.out.println(sumRecursion(5));
       // pattern2(5);
//        System.out.println(fib(7));
      //  System.out.println( average(5,4,3));
    //    pattern1_rec(5);
  //      pattern2_rec(5);

//        float celcius =15.2f;
//        System.out.println( celcius + " °C " +"   ->   " +  CeltoFer(celcius) + " °F");

//        System.out.println(sumIterative(5));




    }

}
