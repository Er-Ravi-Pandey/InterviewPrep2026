package com.DSA.Strings;
import java.util.ArrayList;
import java.util.List;

public class SeparateNumbersFromStrings {



        public static void main(String[] args) {
            String input = "abc38gh89";

            // Regular expression to match numbers
            String[] numbers = input.split("\\D+"); // Splits on non-digit characters

            // Collect numbers into a list (optional)
            List<Integer> numberList = new ArrayList<>();
            for (String num : numbers) {
                if (!num.isEmpty()) { // Ignore empty strings resulting from splits
                    numberList.add(Integer.parseInt(num));
                }
            }

            // Print results
            System.out.println("Numbers: " + numberList ); // Outputs [38, 89]
        }
    }


