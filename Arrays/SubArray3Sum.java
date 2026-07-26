package com.DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArray3Sum {

        public List<List<Integer>> threeSum(int[] nums) {

            List<List<Integer>> result = new ArrayList<>();

            // Step 1: Sort the array
            Arrays.sort(nums);

            // Step 2: Iterate over the array with the first pointer
            for (int i = 0; i < nums.length - 2; i++) {
                // Skip duplicates for the first pointer
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                // Step 3: Use two pointers to find the other two elements
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];

                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        // Skip duplicates for the second and third pointers
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        // Move the pointers after finding a valid triplet
                        left++;
                        right--;
                    } else if (sum < 0) {
                        left++;  // We need a larger sum, so move the left pointer right
                    } else {
                        right--;  // We need a smaller sum, so move the right pointer left
                    }
                }
            }

            return result;
        }



    public static void main(String[] args) {
        SubArray3Sum solution = new SubArray3Sum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = solution.threeSum(nums);

        System.out.println("Unique triplets that sum to zero:");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }}
