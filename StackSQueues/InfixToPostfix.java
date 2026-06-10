package com.DSA.StackSQueues;



import java.util.Stack;

    class InfixToPostfix {

        public static int precedence(char c) {
            if (c == '^') return 3;
            if (c == '*' || c == '/') return 2;
            if (c == '+' || c == '-') return 1;
            return 0;
        }

        public static String infixToPostfix(String s) {
            Stack<Character> st = new Stack<>();
            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (Character.isLetterOrDigit(ch)) {
                    ans.append(ch);
                }
                else if (ch == '(') {
                    st.push(ch);
                }
                else if (ch == ')') {
                    while (!st.isEmpty() && st.peek() != '(') {
                        ans.append(st.pop());
                    }
                    st.pop();
                }
                else {
                    while (!st.isEmpty() && precedence(st.peek()) >= precedence(ch)) {
                        if (ch == '^' && st.peek() == '^')
                            break; // right associativity
                        ans.append(st.pop());
                    }
                    st.push(ch);
                }
            }

            while (!st.isEmpty()) {
                ans.append(st.pop());
            }

            return ans.toString();
        }

        public static String infixToPrefix(String infix) {

            // Step 1: Reverse
            StringBuilder reversed = new StringBuilder(infix).reverse();

            // Step 2: Swap brackets
            for (int i = 0; i < reversed.length(); i++) {

                if (reversed.charAt(i) == '(') {
                    reversed.setCharAt(i, ')');
                }
                else if (reversed.charAt(i) == ')') {
                    reversed.setCharAt(i, '(');
                }
            }

            // Step 3: Convert to postfix
            String postfix = infixToPostfix(reversed.toString());

            // Step 4: Reverse postfix
            return new StringBuilder(postfix).reverse().toString();
        }

        public static void main(String[] args) {

            String infix = "A+B*(C^D-E)";

            System.out.println("Prefix: " + infixToPrefix(infix));
        }
    }
