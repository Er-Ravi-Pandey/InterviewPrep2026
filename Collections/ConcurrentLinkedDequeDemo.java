package com.DSA.Collections;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {
    //non-blocking , thread safe deque
    //CAS- compare and swap

    public static void main(String[] args) {


        ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();//double ended queue// >

        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addFirst(5);

        System.out.println(deque);
    }
}