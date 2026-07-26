package com.DSA.StackSQueues;

import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else {

                // No matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isBalanced("()"));        // true
        System.out.println(isBalanced("()[]{}"));    // true
        System.out.println(isBalanced("([{}])"));    // true
        System.out.println(isBalanced("(]"));        // false
        System.out.println(isBalanced("([)]"));      // false
        System.out.println(isBalanced("(("));        // false
    }
}