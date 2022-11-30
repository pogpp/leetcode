package ru.pogodaev.leetcode.n598;


/**
 * You are given an m x n matrix M initialized with all 0's and an array of operations ops,
 * where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.
 *
 * Count and return the number of maximum integers in the matrix after performing all the operations.*/

public class RangeAddition2 {
    public int maxCount(int m, int n, int[][] ops) {
        for (int[] op : ops) {
            if (op[0] < m) m = op[0];
            if (op[1] < n) n = op[1];
        }
        return m * n;
    }
}
