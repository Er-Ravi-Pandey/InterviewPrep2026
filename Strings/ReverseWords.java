package com.DSA.Strings;

public class ReverseWords {

    public static void main(String[] args) {

        String str = "I love Java";

        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}