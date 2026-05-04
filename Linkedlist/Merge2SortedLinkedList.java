package com.DSA.Linkedlist;

public class Merge2SortedLinkedList {

    public static Node merge2sortedList(Node a , Node b){
        Node dummy=new Node(0);
        Node temp=dummy;


        while(a!=null && b!=null){
            if(a.data <= b.data){
                temp.next=a;
                a=a.next;
            }else{
                temp.next=b;
                b=b.next;
            }
            temp=temp.next;
        }

        if(a==null){
            temp.next=b;
        }else{
            temp.next=a;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(3);
        a.next.next = new Node(5);


        Node b=new Node(4);
        b.next = new Node(6);
        b.next.next = new Node(7);
        b.next.next.next = new Node(9);

        Node head=merge2sortedList(a,b);
        print(head);

    }
    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }
}
