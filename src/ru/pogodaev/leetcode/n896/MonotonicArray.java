package ru.pogodaev.leetcode.n896;

public class MonotonicArray {
    public static boolean isMonotonic(int[] A) {
        if (A.length == 0) return true;
        if (A.length == 1) return true;
        if (A.length == 2) return true;
        boolean pos = false;
        boolean neg = false;
        boolean eqs = false;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                neg = true;
            } else if (A[i] < A[i + 1]) {
                pos = true;

            } else if (A[i] == A[i + 1]) {
                eqs = true;
            }
        }

        if (pos && eqs && !neg) return true;
        if (neg && eqs && !pos) return true;
        if (neg && !eqs && !pos) return true;
        if (pos && !eqs && !neg) return true;
        if (eqs && !pos && !neg) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] first = {1, 2, 2, 3};
        int[] second = {6, 5, 5, 4};
        int[] third = {1, 3, 2};
        int[] forth = {1, 2, 4, 5};
        int[] five = {1, 1, 1};
        System.out.println(isMonotonic(first));
        System.out.println(isMonotonic(second));
        System.out.println(isMonotonic(third));
        System.out.println(isMonotonic(forth));
        System.out.println(isMonotonic(five));
    }
}
