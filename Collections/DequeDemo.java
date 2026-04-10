package com.DSA.Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        java.util.Deque<String> deque = new java.util.ArrayDeque<>();
        //double ended queue
        // allows insertion and deletion from both ends
        //versatile than regular queues and stacks as it allows insertion and deletion from both ends

        /*
         * Insertion Methods
         * addFirst() - insert element at the front
         * addLast() - insert element at the end
         * OfferFirst() - insert element at the front if possible
         * OfferLast() - insert element at the end if possible
         *
         * */

        /*
         * Deletion Methods
         * removeFirst() - remove element from the front
         * removeLast() - remove element from the end
         * pollFirst() - remove element from the front if possible
         * pollLast() - remove element from the end if possible
         * */


        /*
         * Access Methods
         * getFirst() - return element from the front
         * getLast() - return element from the end
         * peekFirst() - return element from the front if possible
         * peekLast() - return element from the end if possible
         * */

        /*
         * Search Methods
         * contains() - check if element is present in the deque
         * */

        /*
        Stack Methods
        push() - insert element at the front
         */


        Deque<Integer> deque1 = new ArrayDeque<>(); //faster iteration, low memory overhead and no null elements
       //deque is actually a circular double ended queue
        //head is connected to tail
        //no need to shift element and just shift head and tail



        deque1.addFirst(3);
        deque1.addFirst(4);
        deque1.offerFirst(5);
        deque1.offerLast(6);
        //3,4,5,6
        System.out.println(deque1);

        System.out.println("first element" + deque1.getFirst());

        System.out.println("first element" + deque1.getLast());

        System.out.println("first element" + deque1.peekFirst());



        //Linkedlist acting as Deque
        Deque<Integer> deque2 = new LinkedList<>(); // insertion , deletion somewhere in the middle

    }
}
