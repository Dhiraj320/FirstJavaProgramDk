package com.DSA.OOPs.OOps5.interfaces.ExtendingInterface2;

public interface A {
    default void fun(){

    };
    // Static method should always have a body
    // call them via interface name
    static void greeting(){
        System.out.println("I am static in Interface");
    }
}
