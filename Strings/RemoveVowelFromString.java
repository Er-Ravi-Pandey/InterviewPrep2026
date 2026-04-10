package com.DSA.Strings;

import java.util.Set;

public class RemoveVowelFromString {

    public String removeVowel(String str) {
        char[] charArray=str.toCharArray();

        Set<Character> vowels=Set.of('a','e','i','o','u');

        StringBuilder sb=new StringBuilder();

        for(Character ch: charArray){
            if(!vowels.contains(ch)){
                sb.append(ch);
            }
        }

        return sb.toString();
    }




    public static void main(String[] args) {
        RemoveVowelFromString ss=new RemoveVowelFromString();
        System.out.print(ss.removeVowel("RaviPandey"));
    }
}
