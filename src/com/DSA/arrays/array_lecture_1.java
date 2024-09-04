package DSA.arrays;

import java.util.Scanner;

public class array_lecture_1 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        // we  ask the user to what size of array you want
        //for that
        int n=s.nextInt();
        int[] arr = new int[n];
        //using for loop doing s.nextInt()

        for(int i=0;i<n; i++){
            int a= s.nextInt();
            arr[i]=a;

        }
       for (int i = 0; i < n; i++)
        System.out.println(arr[i]);
    }
}

