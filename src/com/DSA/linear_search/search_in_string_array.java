package com.DSA.linear_search;

import java.util.Arrays;

public class search_in_string_array {
    public static void main(String[] args) {
        String name = "Dhiraj";
        char target = 'i';
        System.out.println(search(name ,target));

        System.out.println(Arrays.toString(name.toCharArray()));// for coveting string to char array

    }

    static boolean search(String str, char target){
        if(str.length() ==0){
            return false;

        }
        for(int i = 0; i < str.length(); i++){
           if(target == str.charAt(i)){
               return true;
           }
        }

        return false;

    }
    //using for each
    // for this we convert the string to charArray
    static boolean search2(String str, char target){
        if(str.length() ==0){
            return false;

        }
        for (char ch :str.toCharArray()
             ) {
            if(ch == target){
                return true;
            }

        }

        return false;

    }
}
