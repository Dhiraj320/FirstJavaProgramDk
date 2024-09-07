package com.DSA.Queue.CircularQueue;

public class DynamicQueue extends CircularQueue {


    public DynamicQueue() {
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if(isFull()){
            // double the array size;
            int []temp= new int[data.length*2];
            // at this point we know array is  full
            // so copy all the previous in temp
            for(int i=0; i<data.length; i++){ // here i represent item at that index
                temp[i]=data[(start+i)%data.length];
            }
            start=0;
            end=data.length;
            data=temp;
        }
        // at this point we know array is not full
        // so just do push item normally
        return super.insert(item);
    }
}
