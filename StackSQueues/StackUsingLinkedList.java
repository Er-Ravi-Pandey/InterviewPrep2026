package com.DSA.StackSQueues;

public class StackUsingLinkedList {

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    // PUSH
    public void push(int data) {

        Node newNode = new Node(data);

        newNode.next = top;

        top = newNode;
    }

    // POP
    public int pop() {

        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int popped = top.data;

        top = top.next;

        return popped;
    }

    // PEEK
    public int peek() {

        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    // PRINT STACK
    public void print() {

        Node temp = top;

        while (temp != null) {

            System.out.print(temp.data + " --> ");

            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        StackUsingLinkedList stack = new StackUsingLinkedList();

        // dummy inputs
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after push:");
        stack.print();

        System.out.println("Peek Element: " + stack.peek());

        System.out.println("Popped Element: " + stack.pop());

        System.out.println("Stack after pop:");
        stack.print();
    }
}