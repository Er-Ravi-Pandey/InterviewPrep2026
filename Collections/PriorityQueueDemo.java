package com.DSA.Collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //part of the Queue interface
        //orders the elements in natural priority order(for primitives lowest first)

        //Priority Queue is an interface, PriorityQueue is a class, implements Priority Queue
        //does not allow null element


        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(15);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(5);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.peek());

        //Priority Queue internal implementation as a min-heap by default (for natural ordering)
        //min heap is a complete binary tree where the value of each node is less than or equal to its child nodes
        //complexity is O(log n)


    }
}
