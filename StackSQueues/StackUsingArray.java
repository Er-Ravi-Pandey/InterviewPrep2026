package com.DSA.StackSQueues;

public class StackUsingArray {

    int[] arr;
    int top;
    int size;

    public StackUsingArray(int size) {

        this.size = size;

        arr = new int[size];

        top = -1;
    }

    // PUSH
    public void push(int data) {

        if (top == size - 1) {

            System.out.println("Stack Overflow");
            return;
        }

        top++;

        arr[top] = data;
    }

    // POP
    public int pop() {

        if (top == -1) {

            System.out.println("Stack Underflow");
            return -1;
        }

        int popped = arr[top];

        top--;

        return popped;
    }

    // PEEK
    public int peek() {

        if (top == -1) {

            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    // PRINT
    public void print() {

        for (int i = top; i >= 0; i--) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        StackUsingArray stack = new StackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.print();

        System.out.println("Peek: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        stack.print();
    }
}