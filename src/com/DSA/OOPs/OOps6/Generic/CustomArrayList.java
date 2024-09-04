package DSA.OOPs.OOps6.Generic;

import java.util.Arrays;

public class CustomArrayList {
    private int []data;
    private static int DEFAULT_SIZE=10;
    private int size=0;// also working as index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(this.isFull()){
            reSize();

        }
        data[size++]=num;
    }

    private void reSize() {
        int[]temp=new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data =temp;

    }

    private boolean isFull() {
        return size==data.length;

    }
    public int remove(){
        int removed=data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){

        return size;
    }
    public void set(int index, int value){
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

        CustomArrayList list = new CustomArrayList();
        for(int i=0;i<14;i++){
            list.add(2*i);
        }


        System.out.println(list);


    }
}