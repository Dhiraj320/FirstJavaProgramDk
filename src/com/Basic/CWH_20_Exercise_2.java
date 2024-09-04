package com.Basic;

import java.util.Scanner;

public class CWH_20_Exercise_2 {
    public static void main(String[] args) {
        //rock paper scissor game
        // 0 for rock
        // 1 for paper
        // 2 scissor
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 0 for rock , 1 for paper , 2 for scissor");
//        int userInput = sc.nextInt();
//
//        Random random = new Random();
//        int computerInput = random.nextInt(3);
//
//        if (userInput == computerInput){
//            System.out.println("Draw");
//        }
//        else  if (userInput == 0 && computerInput == 2 ||userInput ==1 && computerInput == 0
//                 ||userInput ==2 && computerInput ==1){
//            System.out.println("You Win!");
//        }
//        else{
//            System.out.println("computer win!");
//
//        }
//        System.out.println("computer choice :" + computerInput);
//        if(computerInput == 0){
//            System.out.println("computer choice: ROck");
//        }
//
//        else  if(computerInput == 1) {
//            System.out.println("computer choice: Paper");
//        }
//            else  if(computerInput == 2) {
//            System.out.println("computer choice: scissor");
//        }
//        int x= 5;
//        int y =2;
//        System.out.println(x/y);
//
//        char[] message = {'h', 'e ',};
//        String message ="Joy with java";
//        System.out.println(message);
//        for(; ; ){
//
//        }
//int num =10;
//        System.out.println(num++);
//        System.out.println(++num);
//
//        String str1 = "Java";
//        String str2 =  new String("Java");
//        System.out.println(str1==str2);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice userInput1 0 for rock , 1 for paper , 2 for scissor ");
        int userInput1 = sc.nextInt();
        System.out.println("Enter your choice userInput2 0 for rock , 1 for paper , 2 for scissor ");
        int userInput2 =sc.nextInt();

        if(userInput1==userInput2){
            System.out.println("Draw");
        }else if(userInput1==0 && userInput2 ==2 || userInput1==1 &&userInput2 ==0 ||
                userInput1==2 && userInput2 ==1){
            System.out.println("UserInput1 Win");
        }
        else {
            System.out.println("UserInput2 Win");
        }




    }
}
