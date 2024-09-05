package com.DSA.OOPs.OOps5.AbstratcClass;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);

    }

    @Override
void career() {
    System.out.println("I am going to be Engineer");


}

    @Override
    void love() {
        System.out.println("I love teacher");

    }
}
