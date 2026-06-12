package com.DSA.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
    public class LevelOrderTraversal {

        public List<List<Integer>> levelOrder(TreeNode root) {

            Queue<TreeNode> queue = new LinkedList<>();
            List<List<Integer>> groupList = new LinkedList<>();
            if (root == null) {
                return groupList;
            }

            queue.offer(root);

            while (!queue.isEmpty()) {
                int levelNum = queue.size();

                List<Integer> subList = new LinkedList<>();


                for (int i = 0; i < levelNum; i++) {

                    if (queue.peek().left != null) {
                        queue.offer(queue.peek().left);
                    }
                    if (queue.peek().right != null) {
                        queue.offer(queue.peek().right);
                    }

                    subList.add(queue.poll().val);
                }
                groupList.add(subList);
            }


            return groupList;
        }

        public static void main(String[] args) {
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);

            LevelOrderTraversal solution = new LevelOrderTraversal();
            List<List<Integer>> result = solution.levelOrder(root);

            System.out.println("Level Order Traversal:");
            for (List<Integer> level : result) {
                System.out.println(level);
            }
        }
    }
