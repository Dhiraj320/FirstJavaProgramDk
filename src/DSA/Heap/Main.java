package DSA.Heap;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        minHeap<Integer> heap= new minHeap<>();
        heap.insertElement(25);
        heap.insertElement(10);
        heap.insertElement(15);
        heap.insertElement(65);
        heap.insertElement(3);
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());

        ArrayList<Integer> list =heap.heapSort();
        System.out.println(list);
    }
}
