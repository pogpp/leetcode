package ru.pogodaev.leetcode.n697;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
 * <p>
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
 */

public class DegreeOfArray {

    public static void main(String[] args) {
        int[] first = {1, 2, 2, 3, 1, 4, 2};
        int[] second = {1, 2, 2, 3, 1};
        int[] third = {2, 1};
//        System.out.println(findShortestSubArray(first));
//        System.out.println(findShortestSubArray(second));
        System.out.println(findShortestSubArray(third));
    }

    public static int findShortestSubArray(int[] nums) {
        int[] cnt = new int[50000];
        for (int k : nums) {
            cnt[k]++;
        }


        int max = 0;
        for (int l : cnt) {
            max = Math.max(max, l);
        }

        List<Integer> maxes = new ArrayList<>();

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == max) maxes.add(i);
        }

        List<Integer> length = new ArrayList<>();
        for (int m : maxes) {

            int f = -1;
            int l = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == m) {
                    if (f == -1) {
                        f = i;
                        l = i;
                    } else {
                        l = i;
                    }
                }
            }
            length.add(l - f + 1);
        }
        int min = Integer.MAX_VALUE;
        for (int l : length) {
            min = Math.min(l, min);
        }

        return min;

    }
}
