package com.DSA.Collections;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkdedList {


    //charateristics of linkedList

//    Insertion and deletion - it offers frequent insertion and deletions in the middle of the list
//    because it does not require shifting
//    of elements as in ArrayList

//    Random Access: LinkdedList has slower random access(get(int index)) compared to ArrayList bacause it has to
//    traverse the list from the beginning to reach the desiredindex
//
//
//    Memory overhead- LinkedList requires more memory than ArrayList because each node in a linkedlist required extra
//    memory to store references to the next and prev noded.


    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.get(2); //O(n)
        linkedList.addFirst(5); //O(1)
        linkedList.addLast(7); //O(1)
        linkedList.getFirst();
        linkedList.getLast();
        System.out.println(linkedList);
        linkedList.removeIf(x -> x % 2 == 0);
        System.out.println(linkedList);



        LinkedList<String> animals= new LinkedList<>(Arrays.asList("cat","Dog","cow"));
        LinkedList<String> animalstoremove=new LinkedList<>(Arrays.asList("Dog"));
        animals.removeAll(animalstoremove);


        for(String x:animals){
            System.out.println(x);
        }
        System.out.println(animals);
    }


}
