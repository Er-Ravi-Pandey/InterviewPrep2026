package com.DSA.StackSQueues;

public class QueueUsingArray {

    int[] arr;
    int front;
    int rear;
    int size;

    public QueueUsingArray(int size) {

        this.size = size;

        arr = new int[size];

        front = 0;

        rear = -1;
    }

    // ADD
    public void add(int data) {

        if (rear == size - 1) {

            System.out.println("Queue Overflow");
            return;
        }

        rear++;

        arr[rear] = data;
    }

    // REMOVE
    public int remove() {

        if (front > rear) {

            System.out.println("Queue Underflow");
            return -1;
        }

        int removed = arr[front];

        front++;

        return removed;
    }

    // PEEK
    public int peek() {

        if (front > rear) {

            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    // PRINT
    public void print() {

        for (int i = front; i <= rear; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueUsingArray queue = new QueueUsingArray(5);

        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.print();

        System.out.println("Peek: " + queue.peek());

        System.out.println("Removed: " + queue.remove());

        queue.print();
    }
}