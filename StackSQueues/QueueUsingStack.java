package com.DSA.StackSQueues;

import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    // ADD
    public void add(int data) {

        st.push(data);
    }

    // REMOVE
    public int remove() {

        // Queue empty
        if (st.isEmpty() && st2.isEmpty()) {

            System.out.println("Queue is Empty");
            return -1;
        }

        // transfer only if st2 empty
        if (st2.isEmpty()) {

            while (!st.isEmpty()) {

                st2.push(st.pop());
            }
        }

        return st2.pop();
    }

    // PRINT
    public void print() {

        System.out.println(st2);
        System.out.println(st);
    }

    public static void main(String[] args) {

        QueueUsingStack queue = new QueueUsingStack();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Removed: " + queue.remove());

        System.out.println("Removed: " + queue.remove());

        queue.add(40);

        System.out.println("Removed: " + queue.remove());

        System.out.println("Removed: " + queue.remove());
    }
}