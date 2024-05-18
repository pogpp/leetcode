package ru.pogodaev.leetcode.n1426;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr.
 * If there are duplicates in arr, count them separately.
 */
public class CountingElements {
    public int countElements(int[] arr) {
        int counter = 0;
        Set<Integer> set = new HashSet<>();
        for (int k : arr) {
            set.add(k);
        }

        for (int k : arr) {
            if (set.contains(k + 1)) {
                counter++;
            }
        }

        return counter;
    }
}
