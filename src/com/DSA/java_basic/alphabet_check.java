package DSA.java_basic;

import java.util.Scanner;

public class alphabet_check {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        // we don't have taking input of Character
        // So we use taking input as String
        // and .chartAt(index no.) use for getting the character
        // .trim() for removing space in the String input




        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower Case and the character is " + ch );

        }else{
            System.out.println("Upper Case and the character is  " + ch);
        }




        // this is another approach
//        String word = "  Hello";
//        System.out.println(word.trim().charAt(4));
    }
}
