package com.Basic;

public class CWH_18_switch_case {
    public static void main(String[] args) {
//
//        int age;
//        System.out.println("Enter your age");
//        Scanner sc = new Scanner(System.in);
//        age = sc.nextInt();
//
//        switch(age){
//            case 18:
//                System.out.println("You are going to become an Adult!");
//                break;
//
//            case 23:
//                System.out.println("You are going to join  a Job!");
//                break;
//
//            case 60:
//                System.out.println("You are going to retired!");
//                break;
//
//            default:
//                System.out.println("Enjoy your life");
//
//        }





       // char var = 'r';

      //  switch (var){

           // case 'r':
              //  System.out.println("you are going to become an Adult!");
             //   break;
           // case 'c':
              //  System.out.println("you are going to join a Job!");
            //    break;
            //case 'd':
               // System.out.println("you are going to get Retired!");
             //   break;
            //default:
                //System.out.println("Enjoy your life!");


        String var = "r";

        switch (var) {
            case "r" -> {
                System.out.println("you are going to become an Adult!");
                System.out.println("you are going to join a Job!");

            }
            case "d" -> System.out.println("you are going to join a Job!");
            case "f" -> System.out.println("you are going to get Retired!");
            default -> System.out.println("Enjoy your life!");
        }



       // if we click on switch word the format is in enhanced switch the other way of represent switch without break word

//                String var = "r";
//
//        switch (var) {
//            case "r" -> System.out.println("you are going to become an Adult!");
//            case "d" -> System.out.println("you are going to join a Job!");
//            case "f" -> System.out.println("you are going to get Retired!");
//            default -> System.out.println("Enjoy your life!");
//        }


    }
}
