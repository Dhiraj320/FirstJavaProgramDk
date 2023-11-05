package com.company;
import java.util.*;
public class CWH_91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();

        l2.add(25);
        l2.add(30);
        l2.add(13);

        l1.add(0,6);
        l1.add(2);
        l1.add(5);
        l1.add(4);
        l1.add(6);
//        l1.add(1,2);
        l1.addAll(0,l2);
        l1.set(5, 560);
        l1.remove(5);


       // l1.clone();
       // l1.clear();

//        for(int i=0; i<l1.size(); i++){
//            System.out.println(l1.get(i));
//        }
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        System.out.println(l1.isEmpty());
        System.out.println(l1.subList(1, 3));
        System.out.println(l1.removeIf(n->n%2==0));

//        System.out.println(l1.contains(9));
//        System.out.println(l1.clone());

    }
}
