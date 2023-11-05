package com.company;

import java.util.ArrayDeque;

public class CWH_93_Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq= new ArrayDeque<>();
        adq.add(25);// for adding with exception
        adq.add(26);
        adq.offer(25);// for adding safer
        adq.addFirst(50);// for at first adding with exceptionThrows exception
        adq.addLast(70);// for at last adding with exceptionThrows exception

        adq.offerFirst(98);//for at first adding safer
        adq.offerLast(125);//for at last adding safer
        adq.removeFirst();// for at first removing with exceptionThrows exception
        adq.removeLast();// for at last removing with exceptionThrows exception
        adq.pollFirst();//for at first removing safer
        adq.pollLast();//for at last removing safer
        System.out.println(adq);
        System.out.println(adq.getFirst());
        System.out.println(adq.getLast());
        System.out.println("Without exception");
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println("NextElement");

        System.out.println(adq.pop());


    }
}
