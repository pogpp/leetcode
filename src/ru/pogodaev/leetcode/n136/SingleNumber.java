package ru.pogodaev.leetcode.n136;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int k = nums[0];
        for (int i = 1; i < nums.length; i++) {
            k = k ^ nums[i];
        }
        return k;
    }
}
