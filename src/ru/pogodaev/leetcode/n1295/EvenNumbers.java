package ru.pogodaev.leetcode.n1295;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
public class EvenNumbers {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int k : nums) {
            int chpih = 0;
            while (k != 0) {
                k = k / 10;
                chpih++;
            }
            if (chpih % 2 == 0) counter++;
        }

        return counter;
    }
}
