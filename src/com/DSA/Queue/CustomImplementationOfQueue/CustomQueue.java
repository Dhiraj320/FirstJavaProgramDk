package com.DSA.Queue.CustomImplementationOfQueue;



public class CustomQueue {
    public int[] data;
    protected static final int DEFAULT_SIZE=10;
    int end= 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data=new int[size];
    }
    // insert
    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }


        data[end]=item;
        end++;

        return true;

    }
    public int remove() throws QueueException {
        if(isEmpty()){
            throw new QueueException("Can not remove from empty Queue!!");
        }
        int remove=data[0];

        for(int i=1; i<end; i++){
            data[i-1]=data[i];
        }
        end--;
        return remove;

    }

    public int front() throws QueueException {
        if(isEmpty()){
            throw new QueueException("empty Queue!!");
        }
        return data[0];
    }

    public void display(){
        for(int i=0; i<end; i++){
            System.out.print(data[i]+ " <- ");
        }
        System.out.println("END");
    }

    public boolean isFull() {
        return end== data.length;// ptr is at last index
    }
    public boolean isEmpty() {
        return end== 0;// ptr is at last index
    }

}
class QueueException extends Exception {
    public QueueException(String message) {
        super(message);
    }
}
