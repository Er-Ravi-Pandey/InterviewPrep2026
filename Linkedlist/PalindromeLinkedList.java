package com.DSA.Linkedlist;

public class PalindromeLinkedList {


    //reverse the list
    public static Node reverseLL(Node head) {
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;

        }
        return prev;
    }

    public static boolean PalindromeList(Node head) {
        if (head == null || head.next == null) return true; // Empty or single node list

        // Find the middle of the list
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        Node newHead = reverseLL(slow);


        //compare the two halves

        Node firstHalf = head;
        Node secondHalf = newHead;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {

                //restoring the list again post reverse
                reverseLL(secondHalf);
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;

        }
        //restoring the list
        reverseLL(secondHalf);
        return true;


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
        head.next.next = new Node(5);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(11);

        print(head);

        System.out.println(PalindromeList(head));

    }
}
