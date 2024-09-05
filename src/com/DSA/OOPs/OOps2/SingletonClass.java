package com.DSA.OOPs.OOps2;

public class SingletonClass {
    private SingletonClass(){

    }
    private static SingletonClass instance;
    public static SingletonClass getInstance(){
        if(instance==null){
            instance = new SingletonClass();
        }
        return instance;




    }



}


