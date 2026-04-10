package com.DSA.Collections;


import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        //In Queue elements are added at the rear/end and will come out from the front
        //LinkedList can act as Stack and Queue

        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(3); //enqueue
        list.addLast(4); //enqueue
        list.addLast(6);
        list.addLast(8);

        System.out.println(list);

        list.removeFirst(); //deque
        list.getFirst();//peek element


        //Linkedlist is implemention for Queue
        Queue<Integer> queue=new LinkedList<>();
        queue.add(3); //enqueue
        System.out.println(queue.size());

        System.out.println(queue.remove()); //throw exception if empty
        System.out.println(queue.poll());

        System.out.println(queue.element());//throw exception if empty
        System.out.println(queue.peek());//null

        Queue<Integer> queue1=new ArrayBlockingQueue<>(2);
        System.out.println(queue1.add(3));
        System.out.println(queue1.offer(5));
        System.out.println(queue1.add(3)); //throw exception
        System.out.println(queue1.offer(5)); //false


    }
}
