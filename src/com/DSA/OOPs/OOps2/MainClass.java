package com.DSA.OOPs.OOps2;

public class MainClass {
    public static void main(String[] args){
        SingletonClass obj = SingletonClass.getInstance();
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        //All 3 ref variable are pointing to just one object that is getInstance
    }

}
