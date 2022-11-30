package ru.pogodaev.leetcode.n1331;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Given an array of integers arr, replace each element with its rank.
 * <p>
 * The rank represents how large the element is. The rank has the following rules:
 * <p>
 * Rank is an integer starting from 1.
 * The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
 * Rank should be as small as possible.
 */
public class RankTransform {
    public static void main(String[] args) {
        arrayRankTransform(new int[]{40, 10, 20, 30});
        arrayRankTransform(new int[]{100, 100, 100});
        arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12});
    }

    public static int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int num : set) {
            map.put(num, rank++);
        }
        int[] ranks = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ranks[i] = map.get(arr[i]);
        }
        return ranks;
    }
}
