package com.DSA.Linkedlist;

public class Node {

    int data;
    Node next;

    Node head;
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }

    Node(Node head,int data1) {
        this.data = data1;
        this.next = head;
    }


};
