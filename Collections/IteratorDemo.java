package com.DSA.Collections;

import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {
        //the for-each loop (enhanced for loop) in Java relies on the Iterable interface.
        //Internally, it uses the Iterator returned by Iterable.iterator() to traverse elements.
//        So internally:
//
//        It calls the iterator() method (defined in the Iterable interface).
//
//        Then uses hasNext() and next() from the Iterator object.
//
//        This means any class that implements Iterable (like List, Set, etc.) can be used with the enhanced for loop.
//

//        When not to use for-each
//
//        Use a regular for loop or explicit iterator if:
//
//        You need to modify the collection (e.g., remove elements safely).
//
//        You need index access (e.g., access list.get(i)).
//
//        You need parallel traversal or conditional skip/continue that’s not easily expressed.
//

        List<Integer> list = List.of(12,56,8,97,12);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int val = it.next();
            if (val % 2 == 0) it.remove(); // allowed
        }

        //but the same with for each loop will throw concurrent modification exception
//
//        Concept	Purpose
//        Iterable	Provides the iterator() method. Enables use in for-each loop.
//                Iterator	Provides hasNext() and next() for element traversal.
//        for-each loop	Compiler sugar that uses iterator() behind the scenes.
//
//        Therefore:
//        The for-each loop is implemented based on the Iterable interface — it depends on the presence of the iterator() method to work.

    }
}
