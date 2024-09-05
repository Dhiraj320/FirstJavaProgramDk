package com.DSA.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1-d ArrayList
        /*
        ArrayList<Integer> list = new ArrayList<Integer>();


        // input
        for (int i = 0; i < 5; i++){
            list.add(scanner.nextInt());
        }
        //output
        for (int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }
        //or
        System.out.println(list);

         */


        // multidimensional ArrayList
        ArrayList<ArrayList<Integer>> multidimensionallist = new ArrayList<>();

        //initialize
        for (int i = 0; i <3; i++){
            multidimensionallist.add(new ArrayList<>());
        }
        //add element
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                multidimensionallist.get(i).add(scanner.nextInt());

            }

        }
        System.out.println(multidimensionallist);


    }
}
