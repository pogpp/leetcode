package ru.pogodaev.leetcode.n525;


import java.util.HashMap;
import java.util.Map;

/**
 * Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
 */
public class ContiguousArray {
    public static void main(String[] args) {
        var input = new int[]{1, 0, 1, 1, 0};
        System.out.println(findMaxLength(input));
    }

    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxlen = 0;
        int count = 0;
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);

            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }

        }

        return maxlen;
    }
}
