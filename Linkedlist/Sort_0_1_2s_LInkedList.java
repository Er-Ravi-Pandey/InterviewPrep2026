package com.DSA.Linkedlist;

public class Sort_0_1_2s_LInkedList {

    public static Node sort012LL(Node head) {

        Node zeroHead=new Node(-1);
        Node oneHead=new Node(-1);
        Node twoHead=new Node(-1);

        Node zero=zeroHead;
        Node one=oneHead;
        Node two=twoHead;

        Node temp=head;

        while (temp !=null){
            if(temp.data == 0){
                zero.next=temp;
                zero=zero.next;
            } else if (temp.data == 1) {
                one.next=temp;
                one=one.next;
            }else {
                two.next = temp;
                two = two.next;
            }
            temp=temp.next;
        }

        zero.next=(oneHead.next != null)  ? oneHead.next : twoHead.next;
        one.next=twoHead.next;
        two.next=null;

        return zeroHead.next;
    }





    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(2);
        head.next.next.next = new Node(2);
        head.next.next.next.next= new Node(0);

        Node O=sort012LL(head);
        print(O);

    }
    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }
}
