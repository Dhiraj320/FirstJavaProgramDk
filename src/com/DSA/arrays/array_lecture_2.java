package DSA.arrays;

import java.util.Scanner;

public class array_lecture_2 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // we  ask the user to what size of array you want
        //for that
        int n = s.nextInt();
        int[] arr = new int[n];
        //for addres of the array
//        System.out.println(arr);
        //length of array
//        System.out.println(arr.length);
        //using for loop doing s.nextInt()

        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            arr[i] = a;

        }
        // for maximum of array
//        int max =arr[0];
//        for (int i = 1; i < n; i++) {
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.print("max element is"+max);
//    }
// for minimum of array
//    int max =arr[0];
//        for (int i = 1; i < n; i++) {
//        if(arr[i]<min){
//        min = arr[i];
//        }
//        }
//        System.out.print("min element is"+min);


    }}











