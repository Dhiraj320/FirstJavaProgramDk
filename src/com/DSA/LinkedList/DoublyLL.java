package DSA.LinkedList;

public class DoublyLL {
    Node head;
    public void insertDFirst(int value) {
        Node temp = new Node(value);
        temp.next=head;
        temp.prev=null;
        if(head!=null){ //check for Null pointer
            head.prev = temp;

        }
        head=temp;
    }

    public void displayD(){
        Node temp=head;
        Node last= null;
        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            last =temp;
            temp=temp.next;
        }
        System.out.println("END");
        System.out.println("Display in Reverse");
        while(last!=null){
            System.out.print(last.value+ " -> ");
            last = last.prev;

        }
        System.out.println("START");
    }
    public void insertLastD(int value){
        Node node = new Node(value);
        Node temp=head;
        node.next=null;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;

        }

        temp.next=node;
        node.prev=temp;
    }

    public void insertAfterIndex(int after, int value){
        Node p = find(after);
        if(p==null){
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(value);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev= node;

        }



    }

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


    // template for every Node
    private static class Node{
        private int value;
        private Node next;
        private Node prev;



        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    //
}
