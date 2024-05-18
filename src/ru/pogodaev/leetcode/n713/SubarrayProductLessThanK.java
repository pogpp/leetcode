package ru.pogodaev.leetcode.n713;

/**
 * Given an array of integers nums and an integer k,
 * return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.
 * */

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int ans = 0;
        int left = 0;
        int curr = 1;

        for (int right = 0; right < nums.length; right++) {
            curr *= nums[right];
            while (curr >= k) {
                curr /= nums[left];
                left++;
            }

            ans += right - left + 1;
        }

        return ans;
    }
}
