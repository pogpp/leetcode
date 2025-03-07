package ru.pogodaev.leetcode.n1;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */
public class TwoSum {
    public static void main(String[] args) {
        var input = new int[]{3, 2, 4};
        for (int k : twoSum(input, 6)) {
            System.out.println(k);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        var result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = i;
                result[1] = map.get(nums[i]);
                break;
            } else {
                map.put(target - nums[i], i);
            }
        }

        return result;
    }
}
