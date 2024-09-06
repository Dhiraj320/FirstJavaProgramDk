package com.DSA.Stack;

import java.util.Stack;

public class ExampleWithInbuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(4);
        stack.push(8);
        stack.push(12);
        stack.push(16);
        stack.push(20);
        System.out.println(stack.search(4));//-1 represent the item is not present in stack
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Capacity "+stack.capacity());





    }
}
