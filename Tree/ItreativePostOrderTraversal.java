package com.DSA.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ItreativePostOrderTraversal {

    public List<Integer> postOrder(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        st1.push(root);

        while (!st1.isEmpty()) {

            TreeNode current = st1.pop();
            st2.push(current);

            if (current.left != null) {
                st1.push(current.left);
            }

            if (current.right != null) {
                st1.push(current.right);
            }
        }

        while (!st2.isEmpty()) {
            result.add(st2.pop().val);
        }

        return result;
    }

    public static void main(String[] args) {
        ItreativePostOrderTraversal solution = new ItreativePostOrderTraversal();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = solution.postOrder(root);
        System.out.println("Post-order Traversal: " + result); // Output: [4, 5, 2, 3, 1]
    }

}
