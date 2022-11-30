package ru.pogodaev.leetcode.n485;

public class MaxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int counter = 0;
        for (int num : nums) {
            if (num == 1) {
                counter++;
                if (max < counter) {
                    max = counter;
                }
            } else {
                counter = 0;
            }
        }
        return max;
    }
}
