package ru.pogodaev.leetcode.n1299;


/**
 * Replace Elements with Greatest Element on Right Side
 * <p>
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right,
 * and replace the last element with -1.
 * <p>
 * After doing so, return the array.
 */

public class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        int maxSoFar = arr[arr.length - 1]; //take last element in array as maxVal
        arr[arr.length - 1] = -1;
        //start array traversal from right to left
        for (int i = arr.length - 2; i > -1; i--) {
            int currVal = arr[i];
            arr[i] = maxSoFar;
            maxSoFar = Math.max(maxSoFar, currVal);
            //keep updating maxRight element encountered so far
        }
        return arr;
    }
}
