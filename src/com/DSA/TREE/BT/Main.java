package com.DSA.TREE.BT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BT tree= new BT();
        tree.populate(sc);
//        tree.display();

        tree.preOrder();
        tree.prettyDisplay();
    }

}
