package com.DSA.StackSQueues;

import java.util.Stack;

class Solution {

    public static int precedence(char c) {
        if (c == '^') return 3;
        if (c == '*' || c == '/') return 2;
        if (c == '+' || c == '-') return 1;
        return 0; // Return 0 for non-operator characters
    }


    public static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        // Function to get precedence of operators

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If the character is an operand, add it to output
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }
            // If character is '(', push to stack
            else if (ch == '(') {
                st.push(ch);
            }
            // If character is ')', pop until '(' is found
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                st.pop(); // Remove '(' from stack
            }
            // Operator case
            else {
                while (!st.isEmpty() && precedence(st.peek()) >= precedence(ch)) {
                    if (ch == '^' && st.peek() == '^') break; // Right-associativity for ^
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String infix = "A+B*(C^D-E)";
        System.out.println("Postfix: " + infixToPostfix(infix)); // Output: "ABCD^E-*+"
    }}



