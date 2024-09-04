package com.Basic;

import java.util.ArrayList;

class MyGeneric<T1, T2>{
    private  T1 t1;
    private  T2 t2;
    public MyGeneric( T1 t1, T2 t2) {
        this.t2 = t2;
        this.t1 = t1;
    }


    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }


    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }



}

public class CWH_110_Jeneric_Class {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList();
//        ArrayList<int> list = new ArrayList();// This will produce error
  /*      arraylist.add(54);
        arraylist.add(56);
        int a= arraylist.get(1);
        System.out.println(a);*/

        MyGeneric<String, Integer> g1 = new MyGeneric("MyString", 25);
        String str= g1.getT1();
        Integer int1= g1.getT2();
        System.out.println(str);
        System.out.println(int1);
    }
}
