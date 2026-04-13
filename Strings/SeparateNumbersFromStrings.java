package com.DSA.Strings;
import java.util.ArrayList;
import java.util.List;

public class SeparateNumbersFromStrings {



        public static void main(String[] args) {
            String input = "abc38gh89";

            // Regular expression to match numbers
            //String[] numbers = input.split("\\D+"); // Splits on non-digit characters

            StringBuilder sb=new StringBuilder();
            // Collect numbers into a list (optional)
           // List<Integer> numberList = new ArrayList<>();
            for (char c : input.toCharArray()) {
                if (!Character.isDigit(c)) {
                    sb.append(c);
                }
            }

            System.out.println(sb.toString());
            }
    }


