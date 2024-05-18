package ru.pogodaev.leetcode.n55;

/**
 * You are given an integer array nums.
 * You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * Return true if you can reach the last index, or false otherwise.
 */
public class JumpGame {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        int reach = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (reach < i) return false;
            reach = Math.max(reach, i + nums[i]);
        }
        return true;
    }
}
