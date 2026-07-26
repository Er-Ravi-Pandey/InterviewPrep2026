package com.DSA.Arrays;

import java.util.Arrays;

public class SquareSortedArray {
    //2 pointer approach
    static int[] sortedSquares(int[] arr) {

        int n = arr.length;

        int i = 0;
        int j = n - 1;
        int k = n - 1;

        int[] result = new int[n];

        while (i <= j) {

            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                result[k] = arr[i] * arr[i];
                i++;
            } else {
                result[k] = arr[j] * arr[j];
                j--;
            }

            k--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
       System.out.print("Sorted Squrare - "+ Arrays.toString(sortedSquares(arr)));

    }
}
