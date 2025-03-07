package ru.pogodaev.leetcode.n108;

import ru.pogodaev.leetcode.TreeNode;

/**
 * Given an integer array nums where the elements are sorted in ascending order,
 * convert it to a height-balanced binary search tree.
 */
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return convertToBST(nums, 0, nums.length - 1);
    }

    private TreeNode convertToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        var mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.right = convertToBST(nums, left, mid - 1);
        root.left = convertToBST(nums, mid + 1, right);
        return root;
    }

}
