package ru.pogodaev.leetcode.n654;

import ru.pogodaev.leetcode.TreeNode;

public class MaxBinaryTree {

    public static void main(String[] args) {

    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return construct(nums, 0, nums.length);
    }

    private TreeNode construct(int[] nums, int left, int right) {
        if (left == right) {
            return null;
        }
        // get the maximal element's index
        int maxIndex = left;
        for (int i = left; i < right; i++) {
            maxIndex = nums[i] > nums[maxIndex] ? i : maxIndex;
        }
        TreeNode root = new TreeNode(nums[maxIndex]);
        // call the construct to build left subtree recursively
        root.left = construct(nums, left, maxIndex);
        // call the construct to build right subtree recursively
        root.right = construct(nums, maxIndex + 1, right);
        return root;
    }

}

