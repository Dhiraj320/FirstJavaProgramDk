package com.DSA.LinkedList;



public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node= new Node(value);// creating Node
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;

    }
    public void insertAtIndex(int value, int index){
        if(index==0){
            insertFirst(value);
        }
        if(index==size){
            insertAtLast(value);
        }
        Node temp= head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;

        }
        Node newNode = new Node(value, temp.next);
        temp.next=newNode;
        size++;
    }

    // Insert using Recursion
    public void insertRec(int value, int index){
        head = insertRec(value,index, head);
    }
    private Node insertRec(int value, int index, Node node){
        if(index==0){
            Node temp= new Node(value, node);
            size++;
            return temp;
        }

        node.next = insertRec(value, index-1, node.next);
        return node;

    }
    public void insertAtLast(int value){
        if(tail==null){
            insertFirst(value);

        }else {
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            size++;
        }

    }
    public int deleteFirst(){
        int value=head.value;
        head= head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;

    }
    // for deleting last element
    //first we get the last second index
    public Node get(int index){
        Node node= head;
        for(int i = 0; i < index; i++){
            node=node.next;
        }
        return node;
    }
    //after getting index deleting
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }else {
            Node secondLast = get(size - 2);
            int value = tail.value;
            tail = secondLast;
            tail.next = null;
            return value;
        }
    }
    //finding value of index
    private Node find(int value){
        Node node= head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;

        }
        return null;
    }

    //for deleting at particular index
    // first we get the just before index
    public int deleteAtIndex(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next=prev.next.next;
        return value;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }


    // LeetCode Question Solution 83
    // Remove duplicate from sorted list
    public void deleteDuplicate(){
        Node  node =head;
        while(node!=null && node.next!=null){
            if(node.value== node.next.value){
                node.next= node.next.next;
            }else{
                node = node.next;
            }
        }


    }

    // LeetCode 21
    //Merge Two  sorted Linked List
    public static LL merge(LL first, LL second){
        Node f= first.head;
        Node s = second.head;
        LL ans= new LL();
        while(f!=null && s!=null){
            if(f.value<=s.value){
                ans.insertAtLast(f.value);
                f=f.next;
            }else{
                ans.insertAtLast(s.value);
                s=s.next;

            }

        }
        while(f!=null){
            ans.insertAtLast(f.value);
            f=f.next;

        }
        while(s!=null){
            ans.insertAtLast(s.value);
            s=s.next;


        }
        return ans;

    }
    // Sort Linked List Using Bubble Sort
    public void bubbleSort(){
        bubbleSort(size-1,0);
    }

    private void bubbleSort(int row, int col) {
        if(row==0){
            return;
        }
        if(col<row){
            Node first =get(col);
            Node second=get(col+1);
            if(first.value>second.value){
                // swap
                // 3 cases
                if(first==head){
                    head=second;
                    first.next=second.next;
                    second.next=first;
                }else if(second==tail){
                    Node prev= get(col-1);
                    prev.next=second;
                    tail=first;
                    first.next=null;
                    second.next=tail;
                }else{
                    Node prev= get(col-1);
                    prev.next=second;
                    first.next=second.next;
                    second.next=first;

                }
            }
            bubbleSort(row,col+1);
        }else{
            bubbleSort(row-1,0);
        }
    }
    // Reverse Linked List using Recursion
    private void reverseLL(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverseLL(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;

    }

    public static void main(String[] args) {
        // LeetCode 83
    /*
        LL list= new LL();
        list.insertAtLast(1);
        list.insertAtLast(1);
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(4);
        list.insertAtLast(4);
        list.display();
        list.deleteDuplicate();
        list.display();
        */
        //Leetcode 21
        LL first =new LL();
        LL second = new LL();
        first.insertAtLast(1);
        first.insertAtLast(2);
        first.insertAtLast(3);
        second.insertAtLast(1);
        second.insertAtLast(3);
        second.insertAtLast(4);

        LL ans = merge(first,second);
        ans.display();
        LL list = new LL();
        for(int i=7;i>0;i--){
            list.insertAtLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();


    }




    public static class Node{


        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
