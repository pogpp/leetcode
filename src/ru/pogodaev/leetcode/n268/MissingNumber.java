package ru.pogodaev.leetcode.n268;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return 0;
    }
}
