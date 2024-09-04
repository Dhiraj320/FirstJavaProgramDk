package DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Singly LL

        LL list = new LL();
        list.insertFirst(5);//5th Element
        list.insertFirst(10);//4th Element
        list.insertFirst(15);//3rd Element
        list.insertFirst(20);//2nd Element
        list.insertFirst(25); //1st Element
        list.display();

       list.insertAtLast(99);
        list.display();
        list.insertAtIndex(18, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteAtIndex(3));
        list.display();
//       System.out.println(list.find(18));
        list.insertRec(52, 3);
        list.display();







        // Doubly LL
     /*
        DoublyLL list = new DoublyLL();
        list.insertDFirst(5);
        list.insertDFirst(10);
        list.insertDFirst(15);
        list.insertDFirst(20);
        list.insertDFirst(25);
//        list.displayD();
//        list.insertLastD(45);
//        list.displayD();
        list.insertAfterIndex(15, 256);
        list.displayD();

      */

//        Circular LL;
        /*
        CircularLL list = new CircularLL();
        list.insertInCLL(2);
        list.insertInCLL(4);
        list.insertInCLL(6);
        list.insertInCLL(8);
        list.insertInCLL(10);
        list.displayCLL();
        list.deleteInCLL(10);
        list.displayCLL();

         */















    }
}
