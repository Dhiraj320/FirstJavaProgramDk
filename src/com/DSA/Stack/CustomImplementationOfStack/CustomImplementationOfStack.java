package com.DSA.Stack.CustomImplementationOfStack;


public class CustomImplementationOfStack {
    public CustomImplementationOfStack(int size) {
        this.data=new int[size];
    }


    public CustomImplementationOfStack() {
        this(DEFAULT_SIZE);
    }

    public int[] data;
    protected static final int DEFAULT_SIZE=10;
    int ptr= -1;

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;

        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public boolean add(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;

        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Can not pop from empty stack!!");
        }
        int remove=data[ptr];
        ptr--;
        return remove;
    }
    public int poll() throws StackException {
        if(isEmpty()){
            throw new StackException("Can not peek from empty stack!!");
        }
        int remove=data[ptr];
        ptr--;
        return remove;
    }

    public boolean isFull() {
        return ptr== data.length-1;// ptr is at last index
    }
    public boolean isEmpty() {
        return ptr== -1;// ptr is at last index
    }

}
// Creating Our own Exception class of Stack Exception Handling
class StackException extends Exception {
    public StackException(String message) {
        super(message);
    }
}
