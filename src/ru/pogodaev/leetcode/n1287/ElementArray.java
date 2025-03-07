package ru.pogodaev.leetcode.n1287;


import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array sorted in non-decreasing order,
 * there is exactly one integer in the array that occurs more than 25% of the time.
 * <p>
 * Return that integer.
 */

public class ElementArray {

    public static void main(String[] args) {
        System.out.println(findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
        System.out.println(findSpecialInteger(new int[]{1, 2, 2, 3}));
    }

    public static int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = arr.length;

        for (int h : arr) {
            if (map.containsKey(h)) {
                map.put(h, map.get(h) + 1);
            } else {
                map.put(h, 1);
            }
        }

        for (Map.Entry<Integer, Integer> n : map.entrySet()) {
            if ((double) n.getValue() > len * 0.25) {
                return n.getKey();
            }
        }

        return 0;
    }

    public int findSpecialIntegerr(int[] arr) {
        int n = arr.length, t = n / 4;

        for (int i = 0; i < n - t; i++) {
            if (arr[i] == arr[i + t]) {
                return arr[i];
            }
        }
        return -1;
    }
}
