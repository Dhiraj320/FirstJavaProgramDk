package com.DSA.Stack.CustomImplementationOfStack;

public class DynamicStack extends CustomImplementationOfStack{

    public DynamicStack(int size) {//
        super(size);// super will call CustomImplementationOfStack(size) constructor
    }

    public DynamicStack() {
        super();// super will call CustomImplementationOfStack() constructor;
    }

    @Override
    public boolean push(int item) {
        if(isFull()){
            // double the array size;
            int []temp= new int[data.length*2];
            // at this point we know array is  full
            // so copy all the previous in temp
            for(int i=0; i<data.length; i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        // at this point we know array is not full
        // so just do push item normally
        return super.push(item);
    }
}
