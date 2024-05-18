package ru.pogodaev.n274;

import java.util.Arrays;

/**
 * Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper,
 * return the researcher's h-index.
 * According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the
 * given researcher has published at least h papers that have each been cited at least h times.
 */


public class HIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 0, 6, 1, 5};
        int[] arr1 = new int[]{1, 3, 1};
        int[] arr2 = new int[]{10, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(hIndex(arr));
        System.out.println(hIndex(arr1));
        System.out.println(hIndex(arr2));
    }

    public static int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) return 0;
        Arrays.sort(citations);
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < citations.length; i++) {
            int curH = Math.min(citations[i], citations.length - i);
            result = Math.max(curH, result);
        }

        return result;
    }

    public static int hInd(int[] citations) {
        int n = citations.length;
        int[] counts = new int[n + 1];
        for (int i : citations) {
            if (i > n) {
                counts[n]++;
            } else {
                counts[i]++;
            }
        }
        int h = 0;
        for (int i = n; i >= 0; i--) {
            h += counts[i];
            if (h >= i) {
                return i;
            }
        }
        return 0;
    }

    public static void print(int[] array) {
        System.out.println();
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

}
