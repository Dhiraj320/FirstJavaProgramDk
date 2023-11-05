package com.company;

import java.util.Scanner;

public class CWH_25_ps_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Question 1

//        int n=sc.nextInt();
//       // using for loop
//        for(int i=n; i>0;i--){
//            for(int j=0; j<i; j++){
//                System.out.print("*");
//
//            }
//            System.out.println("\n");
//
//        }

        //using while loop
//        int i=n;
//        while(i>=0){
//            int j=i;
//            while (j>0){
//                System.out.print("*");
//                j--;
//            }
//            System.out.println("\n");
//            i--;
//
//        }

//

        // Question 2

        // using whileloop
//        int i=0;
//        int sum=0;
//        int n= sc.nextInt();
//        while(i<n){
//            sum=sum+(2*i);
//            i++;
//        }
//                System.out.print("sum of even number is:");
//        System.out.println(sum);




        //Question3
        int n =sc.nextInt();
       // for(int i = 0; i<10; i++) // - goes from i=0 to i=9
        for(int i=1; i<=10; i++){
            System.out.printf(
                    "%d X %d = %d\n",

                    n, i, n*i );
//            System.out.println(n*i);
        }

        //Question 4
//        int n =10;
//       // for(int i = 0; i<10; i++)  //- goes from i=0 to i=9
//        for(int i=10; i>=1; i--){
//            System.out.printf("%d X %d = %d\n", n, i, n*i );
//        }


        // Question 5
        // using for loop
//        int i, factorial=1;
//        for(i=1; i<=n; i++){
//            factorial*=i;
//
//        }
//        System.out.printf("factorial  = %d\n", factorial);



        //Question 6
//        int n= sc.nextInt();
//        //what is factorial n = n*n-1*n-2....1
//        //5! = 5*4*3*2*1 = 120
//        int i = 1;
//                int factorial =1;
//        while(i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);


        //Question 8
        //true



//        Question 9
//         int n =sc.nextInt();
//         int sum=0;
//        //for(int i = 0; i<10; i++)  - goes from i=0 to i=9
//         for(int i=1; i<=10; i++){
//          sum += n*i;
//        }
//        System.out.println(sum);

        //Question 10
        // at least once



        // Question11
//        int sum = 0;
//        int n=3;
//        for(int i = 0; i<n; i++){
//           sum = sum + (2*i);
//
//        }
//        System.out.print("sum of even number is : ");
//        System.out.println(sum);
//         First 4 even number - 0,2,4,6






    }
}
