package com.Basic;

public class CWH_32_Method_Overloading {

    //Method overloading
    static void foo(){
        System.out.println("Good morning foo");
    }


    static void foo(int a){  // here a is parameter
        System.out.println("Good morning " + a + " Bro!");

    }




    static void foo(int a, int b){   // here a and b is parameter
        System.out.println("Good morning " + a + " Bro!");
        System.out.println("Good morning " + b + " Bro!");

    }




    /*
    static void change(int a){
        a=98;
    }
    static void change2(int [] arr){
        arr[0]=98;
    }

        static  void tellJoke(){
        System.out.println("I invented  a new word!\n" +
                "Plagiarism");
    }

     */
    public static void main(String[] args) {

     /*   tellJoke();
        // Case 1 Changing the In teger Value but is not change
        int x= 45;
        change(x);
        System.out.println(" The value of x after running change is :" +x);

        // Case 2 Changging The array value and Its is Changed
        int marks []= {12,15,17,18,25};
        // here marks is refrence and refrence of  object is goes in Method
        // here we pass the refrence not copy of the object is
        change2(marks);
        System.out.println(" The value of marks[0] after running change2 is :" + marks[0]);

      */


        //Method_Overloading
        foo();
        foo(3000); // 3000 is argument
        foo(4000, 5800);  // here 4000 and 5800 are argument and they are actual value


    }
}
