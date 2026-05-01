package com.DSA.Linkedlist;

public class RemoveNthFromTheEnd {
    public static Node removeNthFromEnd(Node head, int n) {

        Node slow=head;
        Node fast=head;


        //Important
        for(int i=0;i<n;i++){
            fast=fast.next;
        }


        while(fast.next != null){
            fast=fast.next;
            slow=slow.next;
        }
        Node delNode=slow.next;
        slow.next=slow.next.next;

        System.out.println("Deleted  Node is - " + delNode.data);
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
        Node removed=removeNthFromEnd(head,4);

        print(removed);







    }
}
