package com.DSA.Collections;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {
    //non-blocking , thread safe deque
    //CAS- compare and swap

    public static void main(String[] args) {






                ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

                deque.add(1);
                deque.add(2);
                deque.addFirst(0);

                System.out.println(deque); // [0, 1, 2]

                deque.pollLast();
                System.out.println(deque); // [0, 1]
            }
        }



        //🔹 When to use
        //
        //👉 Use when:
        //
        //Multiple threads need fast access
        //No blocking required
        //Need operations from both ends
        //
        //Example:
        //
        //Task scheduling
        //Work-stealing algorithms


        //ConcurrentLinkedDeque is a thread-safe, non-blocking double-ended queue
        // that allows concurrent access without locks and supports insertion and removal from both ends.”
