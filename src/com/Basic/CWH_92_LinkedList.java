package com.Basic;
import java.util.LinkedList;

public class CWH_92_LinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> l1= new LinkedList<>();
        LinkedList<Integer> l2= new LinkedList<>();

        l2.add(25);
        l2.add(30);
        l2.add(13);
        l2.add(2);

        l1.add(0,6);
        l1.add(2);

        l1.add(5);
        l1.add(4);
        l1.add(6);
        l1.addLast(1000);
        l1.addFirst(1);
        l1.removeFirst();
        l1.removeLast();
        l1.removeFirstOccurrence(6);
        l1.removeLastOccurrence(2);
        l1.add(1,2);
        l1.addAll(0,l2);
        l1.set(5, 560);
        l1.remove(5);
        // l1.clear();

        for(int i=0; i<l1.size(); i++){
            System.out.print(" " +l1.get(i));
        }
    }
}
