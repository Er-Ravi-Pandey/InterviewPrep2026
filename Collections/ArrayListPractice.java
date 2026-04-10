package com.DSA.Collections;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       /* list.add(89);
        list.add(59);
        list.add(26);
*/
       //create List using asList
        List<String> list2=Arrays.asList("A", "B", "C", "D");
        System.out.println(list2.getClass().getName());
        list2.set(0,"R");

        Collections.sort(list2);
        System.out.println(list2);
        //change can't be added , only be updated



        //toArray
        String []arr = list2.toArray(new String[0]); //passing zero is convention to create array of required size
        System.out.println("List to Array" + Arrays.toString(arr));

        //remove using object not index
        list.remove(String.valueOf("A"));
        List<String> list4=new ArrayList<>(list2);
        list4.add("Ravi");
        System.out.println(list4);

       //create List using List.of from java9
        List<String> list3 = List.of("Ravi","Saurabh");
        System.out.println(list3);
        //in this you can't modify the list , not add or remove.

        //using addAll
        list4.addAll(list3);
        System.out.println(list4);

        //System.out.println(list.get(2));
        //System.out.println(list.size());
        /*for(int i=0 ; i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
*/

      /*  list.add(1, 45);
        list.set(2, 100);

        for(int x: list){
            System.out.println(x);
        }*/

      /*  System.out.println(list.contains(59));

      list.remove(1);

        System.out.println(list);*/


        //converting list into Array

        /*
        Time complexity
                Access by index: O(1)
                Search: O(n)
                Insertion: O(n)
                Deletion: O(n)
                Access by value: O(n)   */

    }
}
