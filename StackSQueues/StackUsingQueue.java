package com.DSA.StackSQueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {


    static Queue<Integer> queue=new LinkedList<>();

    public static void push(int data){

        int size=queue.size();
        queue.add(data);

        for(int i=0; i<size;i++){
            queue.add(queue.remove());
        }

        //This loop
       //rotate elements by size - here 2 times
        //means
        //move old elements behind newly inserted element
    }

    public static int peek(){
        if(queue.isEmpty()){
            return -1;
        }

       return queue.peek();
    }

    public static int pop(){
      return   queue.remove();
    }
    public void print() {

        System.out.println(queue);
    }
    public static void main(String[] args) {

        StackUsingQueue stack = new StackUsingQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.print();

        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());

        stack.print();
    }
}