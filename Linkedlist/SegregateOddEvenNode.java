package com.DSA.Linkedlist;

public class SegregateOddEvenNode {

    public static Node oddEvenNode(Node head) {

        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;

        while (even != null && even.next != null) {

            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(68);

        print(head);


        System.out.println("");
        Node removed = oddEvenNode(head);

        print(removed);


    }
}

