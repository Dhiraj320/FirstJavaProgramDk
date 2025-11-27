package com.DSA.Maths.MathsForDSA2;

import java.util.Scanner;

public class primeNumber31stMarchTCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = findNthPrime(a);
        int q = findNthPrime(b);
        System.out.println(p * q - 1);


    }
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i*i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static int findNthPrime(int n) {
            int count = 0;
            int number = 1;
            while (count < n) {
                number++;
                if (isPrime(number)) {
                    count++;
                }
            }
            return number;
        }



}
