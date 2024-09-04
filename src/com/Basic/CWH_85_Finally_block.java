package com.Basic;


public class CWH_85_Finally_block {
    public static int greet (){
        try{
            int a= 50;
            int b=10;
            int c = a/b;
           return c;
        }catch (Exception e){
            System.out.println(e);
        }
        // finally block execute hoga chahe try block ka statment sahi  ho ya na ho
////        finally {
//            System.out.println("This is the end of this function");
////        }
        System.out.println("This is the end of this function"); // agar ye without finally block ke hota hai to run nhi hoga
        // because program try and catch me hi end ho jayega
        return -1;
    }





    public static void main(String[] args) {

        int k =greet();
        System.out.println(k);
//// finally block neccesary
//        int a=7;
//        int b=9;
//        while(true){
//            try{
//            System.out.println(a/b);
//        }catch (Exception e){
//                System.out.println(e);
//                break;
//            }
//            finally{
//                System.out.println("I am finally for value of b : " +b);
//            }
//            b--;
//        }
//// try ke sath finally use kr skte hai but error handle nhi hogi
//        // agar error aati hai to vo print hogi
//        // jaise catch me handle krte the vaise nhi hogi
//        try{
//            System.out.println(5/0);
//        }finally {
//            System.out.println("Yes Finally");
//        }


    }
}
