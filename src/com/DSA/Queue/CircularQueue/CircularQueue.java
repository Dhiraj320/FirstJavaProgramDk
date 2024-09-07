package com.DSA.Queue.CircularQueue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    protected int end= 0;
    public int start=0;
    private  int size=0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data=new int[size];
    }
    // insert
    public boolean insert(int item){
        if(isFull()){
            System.out.println("Circular Queue is full");
            return false;
        }
        data[end++]=item;
        end= end%data.length;
        size++;

        return true;

    }
    public int remove() throws CircularQueueException {
        if(isEmpty()){
            throw new CircularQueueException("Can not remove from empty Circular Queue!!");
        }
        int remove=data[start++];

        start=start%data.length;
        size--;
        return remove;

    }

    public int front() throws CircularQueueException {
        if(isEmpty()){
            throw new CircularQueueException("empty Circular Queue!!");
        }
        return data[start];
    }


    public void display(){
        if(isEmpty()){
            System.out.println("Empty Circular Queue");
            return;
        }
       int i=start;
       do{
           System.out.print(data[i] + " -> ");
           i++;
           i=i%data.length;
       }while (i!=end);
        System.out.println("END");
    }


    public boolean isFull() {
        return size== data.length;// ptr is at last index
    }
    public boolean isEmpty() {
        return size== 0;// ptr is at last index
    }

}
