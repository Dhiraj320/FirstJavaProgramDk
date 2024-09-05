package com.DSA.OOPs.OOps5.AbstratcClass;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    abstract void career();
    abstract void love();

     static void hello(){
         System.out.println("hello");

    }
    void normal(){
        System.out.println("Normal Method");

    }
}
