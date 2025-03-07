package ru.pogodaev.leetcode.n1480;


/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * <p>
 * Return the running sum of nums.
 */
public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] ex1 = runningSum(new int[]{1, 2, 3, 4});

        for (int j : ex1) {
            System.out.println(j);
        }
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }
}

