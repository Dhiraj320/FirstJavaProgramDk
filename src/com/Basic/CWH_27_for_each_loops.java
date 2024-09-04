package com.Basic;

import java.util.Scanner;


public class CWH_27_for_each_loops {
    public static void main(String[] args) {





     /* use of array using float
        float [] marks = {98.5f ,45.5f ,79.5f,99.5f,80.5f};
        System.out.println(marks.length);
        System.out.println(marks[2]);

        use of string using String
//        String [] students = {"arjun" , "ritik", "sumit" ,"mohit "};
        System.out.println(students.length);
        System.out.println(students[2]);

      */
        String [] students = {"arjun" , "ritik", "sumit" ,"mohit "};




       //  int [] marks = {98 ,45 ,79,99,80};
         //System.out.println(marks.length);

         //dislaying the array  (in simple way)
//        System.out.println("Printing using simple way");
//         System.out.println(marks[0]);
//         System.out.println(marks[1]);
//         System.out.println(marks[2]);
//         System.out.println(marks[3]);
//         System.out.println(marks[4]);


    //    dislaying the array  (in for loop)
//        System.out.println("Printing using for loops");
//         for(int i=0; i<marks.length; i++ ){
//             System.out.println(marks[i]);
//         }
//         System.out.println("Printing using for loops");
//         for(int i = 0; i<students.length; i++){
//             System.out.println(students[i]);
//             // System.out.println(students[i].replace('r', 'd'));
//             //System.out.printf("%d", students[i]);
//         }



        //Quick quiz -   dislaying the array  (in reverse order)
      //   System.out.println("Printing using reverse order");

//         for(int i=marks.length -1; i>=0; i-- ){
//             System.out.println(marks[i]);
//             // System.out.printf("%d ", marks[i]);
//             // System.out.print(marks[i]);
//         }

//        for(int i=students.length-1; i>=0; i-- ){
//            System.out.println(students[i]);
//        }





       // For Each loop
        //Quick quiz-   dislaying the array  (for- each- loop)
//        System.out.println("Printing using for each loop");
////        for(int element: marks ){
////            System.out.println(element);
////        }
//
//        for(String element:students ){
//            System.out.println(element);
//        }


        // finding value of index
Scanner  sc = new Scanner(System.in);
//        int[] arrayOfInts =
//                { 32, 87, 3, 589,
//                        12, 1076, 2000,
//                        8, 622, 127 };
//        System.out.println("Please  32, 87, 3, 589, 12, 1076, 2000,8, 622, 127 ");
//        int searchfor =sc.nextInt() ;
//
//        int i;
//        boolean foundIt = false;
//
//        for (i = 0; i < arrayOfInts.length; i++) {
//            if (arrayOfInts[i] == searchfor) {
//                foundIt = true;
//                break;
//            }
//        }
//
//        if (foundIt) {
//            System.out.println("Found " + searchfor + " at index " + i);
//        } else {
//            System.out.println(searchfor + " not in the array");
//        }
        int n =sc.nextInt();
  int [] marks = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
//reading array elements from the user
            marks[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i=0; i<n; i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("Array elements in reverse: ");
        for (int i=n-1; i>=0; i--)
        {
            System.out.println(marks[i]);
        }




















    }
}
