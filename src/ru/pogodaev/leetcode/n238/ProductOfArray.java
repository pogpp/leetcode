package ru.pogodaev.leetcode.n238;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class ProductOfArray {
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4};
        int[] ints = productExceptSelf(test);

        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];

        for (int i = 0, temp = 1; i < length; i++) {
            res[i] = temp;
            temp *= nums[i];
        }
        for (int i = length - 1, temp = 1; i >= 0; i--) {
            res[i] *= temp;
            temp *= nums[i];
        }

        return res;
    }
}
