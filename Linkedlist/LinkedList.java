package com.DSA.Linkedlist;

import jdk.dynalink.Operation;

import java.util.Stack;

public class LinkedList {

    private static Node convertArrToLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    Stack<Integer> stack=new Stack<>();
    //length of LinkedList
    public static int lengthOfLL(Node head){
     int cnt=0;
        Node temp=head;

        while(temp != null){

            temp=temp.next;
            cnt++;
        }
        return cnt;
    }
 //search element in LinkedList
    public static int searchElement(Node head,int value){
        Node temp=head;
        while(temp!=null){

            if(temp.data == value)
                return 1;

            temp=temp.next;
            }
        return 0;
    }

    //remove the head of linkedList
    public static Node removeElement(Node head){
        if(head == null)return head;
        head=head.next;
        return head;
    }

    //remove tail of the linkedList
    public static Node removeTail(Node head){
       Node temp=head;
       while(temp.next.next != null){
           temp=temp.next;
       }
       temp.next=null;
       return head;
    }
    //Remove element from Kth Position of LinkedList
    public static Node removeKth(Node head,int k){

        if(head == null)return head;
        if(k==1){

            head=head.next;
            return head;
        }
        int cnt=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                //this will link with the next node by skipping the matched node
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }return head;
    }
    //Remove element from with matching value from the  LinkedList
    public static Node removeVal(Node head,int val){

        if(head == null)return head;
        if(head.data == val){
            Node temp=head;
            head=head.next;
            return head;
        }

        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.data==val){
                //this will link with the next node by skipping the matched node
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }return head;
    }

//---------------- Insertion in LinkedList ---------------------------------------------//
    public static Node insertHead(Node head, int val){
        //create a new node
        Node temp=new Node(head,val);
        return temp;

    }

   //Insert element at the tail of the LinkedList
   public static Node insertTail(Node head,int val){
       Node temp=head;
       while(temp.next !=null){
           temp=temp.next;
       } //It simply shifts each element and add the last remaining element at the end
       Node newNode=new Node(val);
       temp.next=newNode;
       return head;
   }
   //Insert element at the specified position of linkedlist
    public static Node insertPosition(Node head, int element , int k ){
        if(head==null){
            if(k==1){
                return new Node(element);
            }else {
                return head;
            }
        }
        if(k==1){
          return new Node(head, element);
        }
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            if(cnt == (k-1)){
                Node x=new Node(temp.next, element);
                temp.next= x;
                break;
            } temp=temp.next;
        }

        return head;
    }
    //Insert element before some existing element of LinkedList
    public static Node insertBeforeVal(Node head, int element , int val ){
        if(head==null){
              return null;
            }

        if(head.data == val){
            return new Node(head, element);
        }
        Node temp=head;
        while(temp.next !=null){
            if(temp.next.data == val){
                Node x=new Node(temp.next, element);
                temp.next= x;
                break;
            } temp=temp.next;
        }

        return head;
    }

    //print function
    public static void print(Node head){
        Node temp=head;

        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 4, 5, 6, 7,9,4};
        Node head=convertArrToLinkedList(a);
        Node temp=head;

        while(temp != null){
            System.out.print(temp.data + " --> ");
           temp=temp.next;
        }
        System.out.println("null");

        System.out.println("search of LinkedList "+ searchElement(head,7));

        System.out.println("length of LinkedList "+lengthOfLL(head));


        System.out.println("Remove head of LinkedList ");
        head=removeElement(head);
        print(head);

        System.out.println("Remove tail of LinkedList ");

        head=removeTail(head);
        print(head);

        System.out.println("Remove nth of LinkedList ");
        head=removeKth(head,1);
        print(head);

        System.out.println("Remove val of LinkedList ");
        head=removeVal(head,6);
        print(head);

        System.out.println("Insert val at beginning of  LinkedList ");
        head=insertHead(head,78);
        print(head);

        System.out.println("Insert val at end/tail of  LinkedList ");
        head=insertTail(head,56);
        print(head);

        System.out.println("Insert at any position of LinkedList ");
        head=insertPosition(head,58,3);
        print(head);

        System.out.println("Insert at before some value of LinkedList ");
        head=insertBeforeVal(head,29,9);
        print(head);

        System.out.println("Insert at before some value of LinkedList ");
        head=insertTail(head,19);
        print(head);
    }

}
