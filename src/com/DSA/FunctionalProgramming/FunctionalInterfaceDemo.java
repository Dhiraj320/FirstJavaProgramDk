package com.DSA.FunctionalProgramming;

// functional interface only one method
// some are functional interface are- Runnable, Callable,ActionListener
@FunctionalInterface
interface BookAction{// functional interface without parameter
    void perform();
}
@FunctionalInterface
interface Operation{// functional interface with parameter
    int add(int a, int b);

}
// Lambda Expression syntax
//()->{}
// parameter->{expression body}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // normal way
        /*BookAction action= new BookAction() {
            @Override
            public void perform() {
                System.out.println("Action performed");

            }
        };*/
        // using lambda expression
        BookAction action1= () -> System.out.println("Action performed 1");
        BookAction action2= () -> System.out.println("Action performed 2");
        BookAction action3= () -> System.out.println("Action performed 3");

        action1.perform();
        action2.perform();
        action3.perform();
        // using lambda expression
        Operation addAction= (a, b) -> a+b;
        System.out.println(addAction.add(5, 6));

        // Thread Interface
        new Thread(()->System.out.println("new Thread created")).start();
    }
}
