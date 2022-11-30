package ru.pogodaev.leetcode.n88;


/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.
 */

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = nums1.length - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[l--] = nums1[m--];
            } else {
                nums1[l--] = nums2[n--];
            }
        }

        while (n >= 0) {
            nums1[l--] = nums2[n--];
        }
    }
}
