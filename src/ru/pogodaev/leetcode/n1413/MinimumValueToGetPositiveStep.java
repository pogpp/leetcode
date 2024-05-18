package ru.pogodaev.leetcode.n1413;

/**
 * Given an array of integers nums, you start with an initial positive value startValue.
 * In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).
 * Return the minimum positive value of startValue such that the step by step sum is never less than 1.
 */
public class MinimumValueToGetPositiveStep {
    public static void main(String[] args) {
        System.out.println(minStartValue(new int[]{-3, 2, -3, 4, 2}));
        System.out.println(minStartValue(new int[]{1, 2}));
        System.out.println(minStartValue(new int[]{1, -2, -3}));
    }

    public static int minStartValue(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        int result = 1;

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (prefixSum[i] + result < 1) {
                result += -1 * (result + prefixSum[i] - 1);
            }
        }

        return result;
    }
}
