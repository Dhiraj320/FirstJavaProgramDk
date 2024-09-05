package com.DSA.OOPs.OOps6.ObjectClonning.ShallowCopy;


import java.util.Arrays;

public class ShallowMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCopy kunal = new ShallowCopy(25, "Dhiraj");

        ShallowCopy twin = (ShallowCopy) kunal.clone(); // we use Interface for cloning
        System.out.println("Age: " + twin.age + " Name: " + twin.name); // it give 25
      //Shallow Copy is the value of both original and copy  is changes
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));// Its change the 0 index value
        System.out.println(Arrays.toString(kunal.arr));// for kunal arr its also change value of 0 index


    }
}
