package com.DSA.OOPs.OOps6.ObjectClonning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal= new Human(25,"Dhiraj");
//        Human twin = new Human(kunal); // dont need this for clonning object
        Human twin=(Human) kunal.clone(); // we use Interface for cloning
        System.out.println("Age: " +twin.age + " Name: " + twin.name); // it give 25


    }
}
