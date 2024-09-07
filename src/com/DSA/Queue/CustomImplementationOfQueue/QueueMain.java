package com.DSA.Queue.CustomImplementationOfQueue;

import com.DSA.Queue.CircularQueue.CircularQueue;
import com.DSA.Queue.CircularQueue.CircularQueueException;

public class QueueMain {
    public static void main(String[] args) throws  CircularQueueException {
        /*
        CustomQueue queue=new CustomQueue(5);
        queue.insert(2);
        queue.insert(4);
        queue.insert(6);
        queue.insert(8);
        queue.insert(10);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        */

        CircularQueue queue=new CircularQueue(5);
        queue.insert(2);
        queue.insert(4);
        queue.insert(6);
        queue.insert(8);
        queue.insert(10);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        queue.insert(12);
        queue.display();


    }
}
