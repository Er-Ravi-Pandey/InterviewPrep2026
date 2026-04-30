package com.DSA.Linkedlist;

public class ReverseOfLinkedList {


    public static Node reverseLL(Node head){
        Node temp=head;
        Node prev=null;

        while (temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;

        }
        return prev;
    }

    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }
        public static void main (String[]args){
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(6);
            head.next.next.next.next = new Node(68);


            System.out.println("LinkedList in order =");
            print(head);



            System.out.println("LinkedList in Reverse order =");
            print(reverseLL(head));


        }

    }