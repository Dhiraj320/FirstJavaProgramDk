package com.DSA.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleOfInbuiltQueue {
    public static void main(String[] args) {

        Queue<Integer> q=new LinkedList<>();
        q.add(5);
        q.add(10);
        q.add(15);
        q.add(20);
        q.add(25);
        System.out.println(q.remove());

        //Deque
        Deque<Integer> dec= new ArrayDeque<>();
        dec.add(25);
        System.out.println(dec.remove());
        System.out.println(dec.poll());//it returns null when dec is empty






    }
}
