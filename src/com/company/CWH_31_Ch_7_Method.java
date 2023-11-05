package com.company;

public class CWH_31_Ch_7_Method {
    // is function comes under class than we say function as method
    // 1 way Calling method  without creating object
    //static keyword because main class is static and naming of  datatype and method name like variable
//    static int  logic (int x , int y){
//
//        int z;
//        if(x>y){
//            z = x+y;
//        }
//        else {
//            z = (x + y) * 5;
//        }
//        return z;
//    }


    // 2 way Calling method  with creating object
    // only datatype and method name like variable
//     int  logic (int x , int y){
//
//        int z;
//        if(x>y){
//            z = x+y;
//        }
//        else {
//            z = (x + y) * 5;
//        }
//        return z;
//    }

// practice by 1 way
//    static float  sum(float x, float y){
//        float z;
//        z=x+y;
//        return z;
//
//    }
    // practice by 2 way
     float  sum(float x, float y){
        float z;
        z=x+y;
        return z;

    }


    public static void main(String[] args) {

        // 1 way Calling method  without creating object
//        int a = 5;
//        int b= 7;
//        int c;
//        c = logic(a,b);
//        System.out.println(a +  " " + b);
//        System.out.println(c);


        // 2 way Calling method  with creating object
        // only datatype and method name like variable
        //method invocation using object creation
//        int a = 5;
//        int b= 7;
//        int c;
//        CWH_31_Ch_7_Method obj = new CWH_31_Ch_7_Method();
//        c = obj.logic(a,b);
//        System.out.println(a +  " " + b);
//        System.out.println(c);

// practice by 1 way
//        float a =5.6f;
//        float b =6.89f;
//        float c;
//        c=sum(a, b);
//        System.out.println(c);

        // practice by 2 way
        float a =5.6f;
        float b =6.89f;
        float c;
        CWH_31_Ch_7_Method obj = new CWH_31_Ch_7_Method();
        c= obj.sum(a, b);
        System.out.println(c);



    }
}
