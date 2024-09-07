package com.DSA.Stack.StackQuestions.LeetCodeQuestion;

import java.util.Stack;
//Leetcode 232
//https://leetcode.com/problems/implement-queue-using-stacks/
public class QueueUsingTwoStackRemoveEfficient {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingTwoStackRemoveEfficient() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(x);
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    public int pop() {
        return first.pop();

    }

    public int peek() {
        return first.peek();

    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}
