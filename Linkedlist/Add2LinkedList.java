package com.DSA.Linkedlist;

public class Add2LinkedList {

    public static Node add2List(Node a , Node b){
        Node dummy=new Node(0);
        Node temp=dummy;
        int carry=0;

        while(a!=null || b!=null){

           int x= (a!=null) ? a.data : 0;
           int y= (b!=null) ? b.data :0 ;

           int sum=carry+x+y;

           carry=sum/10;

           temp.next=new Node(sum % 10);

           temp=temp.next;

           if(a!=null) a=a.next;
           if(b!=null) b=b.next;

        }

        if(carry>0){
            temp.next=new Node(carry);
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

        Node head=add2List(a,b);
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
