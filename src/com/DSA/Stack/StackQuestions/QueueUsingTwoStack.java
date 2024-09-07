package com.DSA.Stack.StackQuestions;

import java.util.Stack;

// It's not efficient for removing element
public class QueueUsingTwoStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingTwoStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push (int x){
        first.push(x);
    }
    public int pop(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int popped =second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return popped;

    }
    public int peek(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked =second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;

    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
}

