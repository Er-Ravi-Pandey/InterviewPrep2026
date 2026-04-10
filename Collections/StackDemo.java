package com.DSA.Collections;

import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //stack extends vector , it is synchronized making it thread-safe
        //Stack is used when to perform LIFO operation
        //Stack extends all feature of vector but is constrained by the Stack's LIFO nature


        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(6);
        stack.push(8);
        int x = stack.pop();
        System.out.println(x);


        int y = stack.peek();
        System.out.println(y);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        int z = stack.search(2);
        System.out.println(z);

        //LinkedList can be used as Stack, it can also be implemented using linkedlist

        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.getLast(); //peek , similar to stack
        list.removeLast(); //pop , similar to stack


    }

}
