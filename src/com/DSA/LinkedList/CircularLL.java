package com.DSA.LinkedList;

public class CircularLL {
    private Node head;
    private Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }

    public void insertInCLL(int value){
        Node node = new Node(value);
        if(head==null){
            head=node;
            tail=node;
        }

        tail.next=node;
        node.next=head;
        tail=node;

    }

    public void displayCLL(){
        Node node =head;
        if(head!=null){
            do{
                System.out.print(node.value+ "->");
                node = node.next;
            }while(node!=head);
        }
        System.out.println("HEAD");
    }

    public void deleteInCLL(int value){

        Node node= head;
        if(node==null){
            return;
        }

        if(node.value == value){
            head=head.next;
            tail.next=head;
            return;

        }
        do {
            Node n = node.next;
            if(n.value==value){
                node.next=n.next;
                break;
            }
            node =node.next;
        }while(node!=null);

    }



    // Node
    private static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
