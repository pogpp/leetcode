package ru.pogodaev.leetcode.n643;

/**
 * You are given an integer array `nums` consisting of `n` elements, and an integer `k`.
 * Find a contiguous subarray whose **length is equal to** `k` that has the maximum average value and return _this value_.
 * Any answer with a calculation error less than `10-5` will be accepted.
 */
public class MaxAvgSubArray1 {
    public static void main(String[] args) {
        int[] example = new int[]{1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(example, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0.0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double res = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            res = Math.max(res, sum);
        }

        return res / k;
    }
}
