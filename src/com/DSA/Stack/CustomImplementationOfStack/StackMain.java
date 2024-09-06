package com.DSA.Stack.CustomImplementationOfStack;

public class StackMain {
    public static void main(String[] args) throws StackException {

        // This CustomImplementationOfStack is in fix size
       /*
        CustomImplementationOfStack stack=new CustomImplementationOfStack(5);
        stack.push(10);
        stack.push(15);
        stack.push(25);
        stack.push(45);
        stack.push(55);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        */

        //This DynamicStack has no issue of fix size
        DynamicStack stackD=new DynamicStack();
        stackD.push(10);
        stackD.push(15);
        stackD.push(25);
        stackD.push(45);
        stackD.push(55);
        stackD.push(65);
        stackD.push(75);
        stackD.push(85);
        stackD.push(95);
        stackD.push(105);
        stackD.push(115);
        stackD.push(125);
        System.out.println(stackD.pop());
        System.out.println(stackD.pop());
        System.out.println(stackD.pop());
        System.out.println(stackD.pop());
        System.out.println(stackD.pop());
        System.out.println(stackD.pop());
        System.out.println(stackD.pop());
        System.out.println(stackD.pop());
        System.out.println(stackD.pop());
        System.out.println(stackD.pop());
        System.out.println(stackD.pop());
        System.out.println(stackD.pop());





    }

}
