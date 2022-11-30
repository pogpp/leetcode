package ru.pogodaev.leetcode.n905;


/**
 * Given an array A of non-negative integers,
 * return an array consisting of all the even elements of A, followed by all the odd elements of A.
 * <p>
 * You may return any answer array that satisfies this condition.
 */
public class SortArrayByParity {

    public static void main(String[] args) {
        int[] k = new int[]{3, 1, 2, 4};
        int[] r = sortArrayByParity(k);
        for (int t : r) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static int[] sortArrayByParity(int[] A) {
        int s = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                int k = A[s];
                A[s++] = A[i];
                A[i] = k;
            }
        }
        return A;
    }
}
