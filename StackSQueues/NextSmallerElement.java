package com.DSA.StackSQueues;



import java.util.HashMap;
import java.util.Stack;

public class NextSmallerElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {
            while (!st.isEmpty() && st.peek() > nums2[i]) {
                map.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }


        return res;
    }
    public static void main(String[] args) {

        NextSmallerElement solution = new NextSmallerElement();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = solution.nextGreaterElement(nums1, nums2);

        System.out.print("Next Smaller Elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

