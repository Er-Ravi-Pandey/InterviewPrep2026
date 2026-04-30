package com.DSA.Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        //  CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
        //"Copy On Write" means whenever we are performing any write operation(adding & removing) on the list,
        // it will create a copy of the list and then perform the operation on the copy and then replace the original
        // list with the copy.
        //this ensures that other threads cannot modify the list while we are performing any write operation on the list.
        // (Parallel read operations are allowed and work in threaded environment.)
        // It is thread-safe and provides better performance than ArrayList in multi-threaded environment.

        //Read Operation : Fast and direct , since they happen on a stable list without interferencce from other threads from modification
        //
        // Write Operation : Slow and indirect , since they happen on a copy of the list and then replace the original list with the copy.

        //this will highly recommended for read operations and not recommended for write operations.


        //Implementation using ArrayList

//        List<String> Shoppinglist = new ArrayList<>();
//        Shoppinglist.add("milk");
//        Shoppinglist.add("eggs");
//        Shoppinglist.add("Bread");
//
//        System.out.println("Initial list : " + Shoppinglist);
//
//        for (String item : Shoppinglist) {
//            System.out.println(item);
//
//            if (item.equals("Bread")) {
//                Shoppinglist.remove("Bread");
//                System.out.println("Added Butter in the list");
//            }
//
//            System.out.println(Shoppinglist + "Added Butter in the list");
//        }
//

//        Result :
//        Exception in thread "main" java.util.ConcurrentModificationException
//        at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
//        at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
//        at com.DSA.Collections.CopyOnWriteArrayListDemo.main(CopyOnWriteArrayListDemo.java:34)
//
       // Now using CopyOnWriteArrayListDemo


        //🔹 Simple comparison
        //Scenario	Use
        //Single thread	ArrayList
        //Multi-thread (read-heavy)	CopyOnWriteArrayList
        //Multi-thread (write-heavy)	Collections.synchronizedList or others


        //🟡 Collections.synchronizedList
        //
        //👉 Uses one lock for everything
        //
        //Read → lock
        //Write → lock
        //Everyone waits
        //Result:
        //Simple
        //Safe
        //But blocking
        //🟢 CopyOnWriteArrayList
        //
        //👉 No lock for reads
        //
        //Read → no lock
        //Write → create new copy
        //Result:
        //Reads are super fast
        //Writes are expensive




        //🔹 Real difference (this is the key)
        //
        //👉 Ask yourself ONE question:
        //
        //“What is happening more — reads or writes?”
        //
        //🟢 Case 1: Many reads, few writes
        //
        //Example:
        //
        //config data
        //list of listeners
        //
        //👉 Use:
        //CopyOnWriteArrayList
        //
        //Because:
        //
        //reads don’t block
        //system stays fast
        //🔴 Case 2: Frequent writes
        //
        //Example:
        //
        //threads constantly adding/removing
        //
        //👉 Use:
        //synchronizedList
        //
        //Because:
        //
        //no copying overhead
        //more efficient for updates

        //“Both provide thread safety, but synchronizedList uses a single lock and blocks both reads and writes,
        // while CopyOnWriteArrayList allows concurrent reads without locking and creates a new copy on writes,
        // making it suitable for read-heavy scenarios.”
        List<String> Shoppinglist2 = new CopyOnWriteArrayList<>();
        Shoppinglist2.add("milk");
        Shoppinglist2.add("eggs");
        Shoppinglist2.add("Bread");

        System.out.println("Initial list : " + Shoppinglist2);

        for (String item : Shoppinglist2) {
            System.out.println(item);

            if (item.equals("Bread")) {
                Shoppinglist2.add("Butter");
                System.out.println("Added Butter in the list");
            }

            System.out.println(Shoppinglist2 + "Added Butter in the Shoppinglist2");
        }



    }}
