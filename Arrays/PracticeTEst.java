package com.DSA.Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PracticeTEst {


    public static void main(String[] args) {


        //Input: l1 = [2,4,3], l2 = [5,6,4]
        //
        //
        // Output: [7,0,8]
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> result=new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(3);


        list1.add(5);
        list1.add(6);
        list1.add(4);


        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i));
        }

        for(int j=0;j<result.size();j++){


        }




//        char[] characters = {'a','b','c','d','e','f'};
//        int[] indexes = {0,3, 2};
//        List<Character> list=new ArrayList<>();
//        for(int i=0;i<characters.length;i++){
//            list.add(characters[i]);
//        }
//        int j;
//        for(j=0;j<indexes.length;j++){
//            list.remove(j);
//        }
//
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i));
//        }
//        System.out.println();

    }




}
