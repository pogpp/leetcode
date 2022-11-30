package ru.pogodaev.leetcode.n509;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {


    public int fib(int n) {

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        int result;
        if (n < 2) {
            result = n;
        } else {
            result = fib(n - 1) + fib(n - 2);
        }

        cache.put(n, result);
        return result;
    }


    private Map<Integer, Integer> cache = new HashMap<>();
}
