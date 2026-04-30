package com.DSA.Linkedlist;

public class MiddleOfLL {

    public static Node middleNode(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(68);

        Node mid=middleNode(head);
        System.out.println(mid.data);




    }



}
