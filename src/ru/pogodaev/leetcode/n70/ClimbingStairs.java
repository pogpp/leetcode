package ru.pogodaev.leetcode.n70;

import java.util.HashMap;
import java.util.Map;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
    //0, 1, 2, 3, 4,
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    private static final Map<Integer, Integer> cache = new HashMap<>();

    public static int climbStairs(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        int result;
        if (n <= 2) {
            result = n;
        } else {
            result = climbStairs(n - 1) + climbStairs(n - 2);
        }

        cache.put(n, result);
        return result;
    }
}
