package com.DSA.Strings;

public class SubsequenceProblem {

    //Subsequence problem in String is a seq of character from the string.
    // "abcde" -> ace is subsequence but aeb not.



    public static boolean isSubsequence(String s1, String s2){
        int i=0,j=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j==s2.length();
    }

    public static void main(String[] args) {
        String s1="abcde";
        String s2="acb";
        System.out.println(isSubsequence(s1,s2));
    }
}
