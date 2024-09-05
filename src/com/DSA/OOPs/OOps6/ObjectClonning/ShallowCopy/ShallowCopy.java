package com.DSA.OOPs.OOps6.ObjectClonning.ShallowCopy;

public class ShallowCopy implements Cloneable {

    int age;
    String name;
    int []arr;


    public ShallowCopy(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr= new int[]{3,4,9,6,1};
    }
    //     we use Interface for cloning
    public Object clone() throws CloneNotSupportedException {
        //this is ShallowCopy
        return super.clone();



    }
}

