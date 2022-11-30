package ru.pogodaev.leetcode.n35;

/**Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.*/

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }

        if (nums[0] > target) return 0;
        if (nums[nums.length - 1] < target) return nums.length;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < target && target < nums[i + 1]) {
                return i + 1;
            }
        }

        return -1;
    }
}
