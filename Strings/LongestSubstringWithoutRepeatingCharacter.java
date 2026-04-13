package com.DSA.Strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter {

    public int longestSubstring(String s){

        Map<Character,Integer> map=new HashMap<>();

        int start=0;
        int max=0;

        for(int end=0;end<s.length();end++){

            char c=s.charAt(end);
            if(map.containsKey(c)){
                start=Math.max(start,map.get(c)+1);
            }

            map.put(c,end);

            max=Math.max(max,end-start+1);


        }
        return max;
    }



    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacter a=new LongestSubstringWithoutRepeatingCharacter();
        System.out.println(a.longestSubstring("abcabcbbabcdefgh"));
    }
}
