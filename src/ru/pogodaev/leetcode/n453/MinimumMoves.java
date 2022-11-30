package ru.pogodaev.leetcode.n453;

public class MinimumMoves {
    public int minMoves(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int x : nums) {
            min = Math.min(min, x);
        }
        int count = 0;
        for (int x : nums) {
            count = count + (x - min);
        }
        return count;
    }
}
