package com.DSA.Tree;

import java.util.List;

import java.util.ArrayList;
import java.util.Stack;


public class IterativeInorderTraversal {

        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode current = root;

            // Continue until there are no nodes left to process.
            while (current != null || !stack.isEmpty()) {
                // Reach the leftmost node of the current node.
                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }
                // current is now null; pop the top element from the stack.
                current = stack.pop();
                // Add the node's value to result (this is the "Root" part of Left-Root-Right).
                result.add(current.val);
                // Now, we need to process the right subtree of this node.
                current = current.right;
            }

            return result;
        }

        public static void main(String[] args) {
            // Construct the following tree:
            //         1
            //        / \
            //       2   3
            //      / \
            //     4   5

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);

            IterativeInorderTraversal sol = new IterativeInorderTraversal();
            List<Integer> inorderList = sol.inorderTraversal(root);
            System.out.println("Inorder Traversal (Iterative): " + inorderList);
            // Expected Output: [4, 2, 5, 1, 3]
        }
    }


