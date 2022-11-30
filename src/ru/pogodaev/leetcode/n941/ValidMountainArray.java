package ru.pogodaev.leetcode.n941;

public class ValidMountainArray {

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{2, 1}));
        System.out.println(validMountainArray(new int[]{3, 5, 5}));
        System.out.println(validMountainArray(new int[]{0, 3, 2, 1}));
    }

    public static boolean validMountainArray(int[] arr) {

        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) max = i;
        }

        if (max == 0) return false;
        if (max == arr.length - 1) return false;

        for (int i = 0; i < max - 1; i++) {
            if (arr[i] == arr[i + 1] || arr[i] > arr[i + 1]) {
                return false;
            }
        }
        for (int i = max; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] || arr[i] < arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public boolean validMountainArrays(int[] A) {
        int n = A.length, i = 0, j = n - 1;
        while (i + 1 < n && A[i] < A[i + 1]) i++;
        while (j > 0 && A[j - 1] > A[j]) j--;
        return i > 0 && i == j && j < n - 1;
    }



}
