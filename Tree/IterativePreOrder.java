package com.DSA.Tree;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class IterativePreOrder {

    public List<Integer> preOrder(TreeNode root){

        java.util.List<Integer> list=new LinkedList<>();
        if (root==null) {return  list;}

        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){

            TreeNode current = st.pop();

            list.add(current.val);

            if(current.right != null){
                st.push(current.right);
            }

            if(current.left != null){
                st.push(current.left);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        IterativePreOrder solution = new IterativePreOrder();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = solution.preOrder(root);
        System.out.println("Pre-order Traversal: " + result); // Output: [1, 2, 4, 5, 3]
    }
}
