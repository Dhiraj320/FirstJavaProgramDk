package com.company;

public class CWH_80_Try_catch {
    public static void main(String[] args) {
        // Without try catch block
        int a=6022;
        int b=0;
        int c = a / b;  // it gives arithmetic exception
        // so it not print c and exit from program
        System.out.println("The result is :"  + c);



        // with Try catch block
//        int a=6022;
//        int b=0;
//        try {
//            // try block ka code run hoga agr hua to statement print
//            // ho jayega other  catch block ka statement run hoga
//            int c = a / b;
//            System.out.println("The result is :"  + c);
//        }catch (Exception e){
//            System.out.println("The " + a  +" is not divisible by " +b  );
          //System.out.println(e);
//        }

    }
}
