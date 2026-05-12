package com.DSA.StackSQueues;

public class QueueUsingLinkedList {

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    // ADD
    public void add(int data) {

        Node newNode = new Node(data);

        // empty queue
        if (front == null) {

            front = rear = newNode;
            return;
        }

        rear.next = newNode;

        rear = newNode;
    }

    // REMOVE
    public int remove() {

        if (front == null) {

            System.out.println("Queue is Empty");
            return -1;
        }

        int removed = front.data;

        // single element
        if (front == rear) {

            front = rear = null;
        }
        else {

            front = front.next;
        }

        return removed;
    }

    // PEEK
    public int peek() {

        if (front == null) {

            System.out.println("Queue is Empty");
            return -1;
        }

        return front.data;
    }

    // PRINT QUEUE
    public void print() {

        Node temp = front;

        while (temp != null) {

            System.out.print(temp.data + " --> ");

            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue after insertion:");
        queue.print();

        System.out.println("Peek Element: " + queue.peek());

        System.out.println("Removed Element: " + queue.remove());

        System.out.println("Queue after removal:");
        queue.print();
    }
}