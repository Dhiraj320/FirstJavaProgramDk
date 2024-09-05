package com.DSA.OOPs.OOps6.ObjectClonning.DeepCopy;



import java.util.Arrays;

public class DeepCopyMain{
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCopy kunal = new DeepCopy(25, "Dhiraj");

        DeepCopy twin = (DeepCopy) kunal.clone(); // we use Interface for cloning
        System.out.println("Age: " + twin.age + " Name: " + twin.name); // it give 25
        //Deep Copy is the value of both original and copy  not changes
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));// twin is changing
        System.out.println(Arrays.toString(kunal.arr));// but not changed for kunal arr


    }
}