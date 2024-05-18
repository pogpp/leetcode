package ru.pogodaev.leetcode.n45;

/**
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
 * Each element nums[i] represents the maximum length of a forward jump from index i.
 * In other words, if you are at nums[i], you can jump to any nums[i + j] where:
 * 0 <= j <= nums[i] and
 * i + j < n
 * Return the minimum number of jumps to reach nums[n - 1].
 * The test cases are generated such that you can reach nums[n - 1].
 */
public class JumpGame2 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        int[] nums2 = new int[]{2, 3, 0, 1, 4};
        int[] nums3 = new int[]{1, 1, 1, 1};
        int[] nums4 = new int[]{1, 2, 1, 1, 1};

        System.out.println(jump(nums4));
        System.out.println(jump(nums));
        System.out.println(jump(nums2));
        System.out.println(jump(nums3));
    }

    public static int jump(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return 0;
        }
        int slow = 0, fast = 0, result = 0, reach = 0;

        while (reach < nums.length - 1) {
            result++;
            for (int i = slow; i <= fast; i++) {
                reach = Math.max(reach, i + nums[i]);
            }
            slow = fast + 1;
            fast = reach;
        }
        return result;
    }
}
