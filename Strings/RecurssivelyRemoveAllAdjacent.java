package com.DSA.Strings;

import java.util.Stack;

public class RecurssivelyRemoveAllAdjacent {

    public String removeAdjacentString(String s){


        Stack<Character> st=new Stack<>();


        for(int i=0; i<s.length();i++){

            char ch=s.charAt(i);


            if(!st.isEmpty() && st.peek() == ch) {
                st.pop();
            }else{
                st.push(ch);
            }

        }
        return st.toString();
    }


    public static void main(String[] args) {
        RecurssivelyRemoveAllAdjacent recurssivelyRemoveAllAdjacent=new RecurssivelyRemoveAllAdjacent();

        System.out.println(recurssivelyRemoveAllAdjacent.removeAdjacentString("axzzxy"));
    }
}
