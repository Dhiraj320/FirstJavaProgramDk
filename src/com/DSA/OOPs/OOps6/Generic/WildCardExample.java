package com.DSA.OOPs.OOps6.Generic;

import java.util.Arrays;
import java.util.List;

public class WildCardExample<T extends Number> {
    private Object []data;
    private static int DEFAULT_SIZE=10;
    private int size=0;// also working as index value
    //Wild Card Syntax
    public void getList(List<? extends Number> list){
        //do something


    }
    //

    public WildCardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(this.isFull()){
            reSize();

        }
        data[size++]=num;
    }

    private void reSize() {
        Object[]temp=new Object[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data =temp;

    }

    private boolean isFull() {
        return size==data.length;

    }
    public int remove(){
        T removed=(T)(data[--size]);
        return (int) removed;
    }
    public T get(int index){

        return (T)data[index];
    }
    public int size(){

        return size;
    }
    public void set(int index, T value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

/*
        WildCardExample<String> list2=new WildCardExample<>();// Not accept String type
        //because we bound it With Only Number
        for(int i=0;i<14;i++){
            list2.add(2*i);
        }
        */
        WildCardExample<Integer> list2=new WildCardExample<>();// Not accept String type
        //because we bound it With Only Number
        for(int i=0;i<14;i++){
            list2.add(2*i);
        }
        System.out.println(list2);




    }

}
