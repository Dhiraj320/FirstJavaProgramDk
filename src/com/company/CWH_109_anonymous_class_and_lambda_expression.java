package com.company;
//For Lambda Expression
// This is normal way
@FunctionalInterface
interface  DemoAno{
    void meth1(int a);
//    void meth2();
}


//For Lambda Expression
// This is normal way
//class HarryFunc implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("This is method 1");
//
//    }
//}



// Here using normal class and for anonymous class
//interface  DemoAno{
//    void meth1();
//    void meth2();
//}




// Here using normal class
//class AnonyDemo implements DemoAno{
//    public  void display(){
//        System.out.println("I am display");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth1");
//
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth2");
//
//    }
//}

public class CWH_109_anonymous_class_and_lambda_expression {
    public static void main(String[] args) {
        // Here using normal class
//        AnonyDemo obj= new AnonyDemo();
//        obj.meth1();
        // Here using anonymous class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//
//            }
//        };
//        obj.meth1();


        //Using Lambda Expression
        // This is normal way

//        DemoAno obj = new HarryFunc();
//        obj.meth1();

        // Now using lambda expression
        DemoAno obj =(a)->{System.out.println("I am method1 form lambda expression " +  a);};
        obj.meth1(6);



    }
}

