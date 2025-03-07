package ru.pogodaev.leetcode.n1004;

/**
 * Given a binary array nums and an integer k,
 * return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 */
public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right;

        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                k--;
            }

            if (k < 0) {
                k += 1 - nums[left];
                left++;
            }
        }

        return right - left;
    }
}
