package com.DSA.Strings;

public class ConvertToUpperCase {

    //convert to uppercase

    public String toUpperCase(String s1) {

        StringBuilder sb = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            sb.append(c);
        }

        return sb.toString();
    }

    public String toLowerCase(String s1) {
        StringBuilder sb1 = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            sb1.append(c);
        }

        return sb1.toString();

    }


    public static void main(String[] args) {

        ConvertToUpperCase cp=new ConvertToUpperCase();
        System.out.println(cp.toUpperCase("ehllo"));
        System.out.println(cp.toLowerCase("Hello"));

    }
}
