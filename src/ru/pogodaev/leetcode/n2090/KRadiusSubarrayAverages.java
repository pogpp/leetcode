package ru.pogodaev.leetcode.n2090;

import java.util.Arrays;

/**
 * You are given a 0-indexed array nums of n integers, and an integer k.
 * <p>
 * The k-radius average for a subarray of nums centered at some index i with the radius k is the average of
 * all elements in nums between the indices i - k and i + k (inclusive).
 * If there are less than k elements before or after the index i, then the k-radius average is -1.
 * Build and return an array avgs of length n where avgs[i] is the k-radius average for the subarray centered at index i.
 * The average of x elements is the sum of the x elements divided by x, using integer division.
 * The integer division truncates toward zero, which means losing its fractional part.
 */
public class KRadiusSubarrayAverages {
    public int[] getAverages(int[] nums, int k) {
        if (k == 0) {
            return nums;
        }

        int windowSize = 2 * k + 1;
        int n = nums.length;
        int[] averages = new int[n];
        Arrays.fill(averages, -1);

        if (windowSize > n) {
            return averages;
        }

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; ++i) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        for (int i = k; i < (n - k); ++i) {
            int leftBound = i - k, rightBound = i + k;
            long subArraySum = prefix[rightBound + 1] - prefix[leftBound];
            int average = (int) (subArraySum / windowSize);
            averages[i] = average;
        }

        return averages;
    }
}
