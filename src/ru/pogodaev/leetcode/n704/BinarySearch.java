package ru.pogodaev.leetcode.n704;

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target,
 * write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int num = nums[mid];

            if (num == target) {
                return mid;
            }

            if (num > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
