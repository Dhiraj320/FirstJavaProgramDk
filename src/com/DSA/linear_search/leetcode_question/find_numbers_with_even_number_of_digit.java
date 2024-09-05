package com.DSA.linear_search.leetcode_question;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
/*
public class find_numbers_with_even_number_of_digit {
    public static void main(String[] args) {
        int[] nums ={12,345,2,6,7896};
        System.out.println(findNumbers(nums));



    }
    static  int findNumbers(int[] nums) {
        int count =0;
        for(int num :nums) {
            if(even(num)){
                count++;

            }

        }
        return count;


    }

    // function to check whether a number contains even digits or not
     static boolean even(int num) {
        int numberOfDigits =digits(num);
        return numberOfDigits %2==0;
        //or
//         if(numberOfDigits %2==0){
//             return true;
//         }
//         return false;



    }
    // function to count number of digits in a number
    static int digits(int num) {
        //edge cases 1
        if(num <0){
            num = num * -1;
        }
        //edge cases 2
        if(num ==0){
            return 1;
        }
        int count  =0;
        while(num>0){
            count++;
            num = num/10;
        }

        return count;


    }


}
*/


/// optimize this code

public class find_numbers_with_even_number_of_digit {
    public static void main(String[] args) {
        int[] nums ={12,345,2,6,7896};
        System.out.println(findNumbers(nums));



    }
    static  int findNumbers(int[] nums) {
        int count =0;
        for(int num :nums) {
            if(even(num)){
                count++;

            }

        }
        return count;


    }

    // function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits =digits(num);
        return numberOfDigits %2==0;
        //or
//         if(numberOfDigits %2==0){
//             return true;
//         }
//         return false;



    }


    // function to count number of digits in a number
    static int digits(int num) {
        //edge cases 1
        if(num <0){
            num = num * -1;
        }
        //edge cases 2
        if(num ==0){
            return 1;
        }
        int count  =0;
        while(num>0){
            count++;
            num = num/10;
        }

        return count;


    }
    //or
     static int digits2(int num) {
            //edge cases 1
            if(num <0){
                num = num * -1;
            }
            //edge cases 2
            if(num ==0){
                return 1;
            }
            return (int)(Math.log10(num)) +1 ;


        }


}

