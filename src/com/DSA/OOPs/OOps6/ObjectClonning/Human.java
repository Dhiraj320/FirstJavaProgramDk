package com.DSA.OOPs.OOps6.ObjectClonning;

public class Human implements Cloneable {

    int age;
    String name;
// // dont need this for clonning object
//    public Human(Human other) {
//        this.age=other.age;
//        this.name=other.name;
//    }
    //


    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
//     we use Interface for cloning
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
        //


    }
}
