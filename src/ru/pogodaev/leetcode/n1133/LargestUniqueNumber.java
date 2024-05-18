package ru.pogodaev.leetcode.n1133;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Given an integer array nums, return the largest integer that only occurs once.
 * If no integer occurs once, return -1.
 */

public class LargestUniqueNumber {
    public static void main(String[] args) {
        var input = new int[]{5, 7, 3, 9, 4, 9, 8, 3, 1};
        largestUniqueNumber(input);
    }

    public static int largestUniqueNumber(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        for (var k : nums) {
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        var unique = new ArrayList<Integer>();
        for (var k : map.keySet()) {
            System.out.println(map.get(k));
            if (map.get(k) == 1) {
                unique.add(k);
            }
        }
        if (unique.size() > 0) {
            unique.sort(null);
            return unique.get(unique.size() - 1);
        }

        return -1;
    }
}
