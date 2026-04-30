package com.DSA.Linkedlist;

import com.DSA.Arrays.SubArray2SumUsingSlidingWindow;

public class RemoveLoopFromLL {


    public static Node detectnRemoveLoop(Node head) {

        Node slow = head;
        Node fast = head;

        // Step 1: detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) break;
        }

        // Step 2: check if no cycle
        if (fast == null || fast.next == null) {
            return head;
        }

        // Step 3: find start of loop
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 4: remove loop
        Node temp = slow;
        while (temp.next != slow) {
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next= head.next.next;



        head=detectnRemoveLoop(head);
        print(head);
    }
    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
}}
