package ru.pogodaev.leetcode.n283;

/**Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 Note that you must do this in-place without making a copy of the array.*/
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int k : nums) {
            System.out.print(k + " ");
        }
        System.out.println();

        int[] ns = new int[]{0};
        moveZeroes(ns);
        for (int k : ns) {
            System.out.print(k + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }

        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
