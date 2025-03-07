package ru.pogodaev.leetcode.n404;

import ru.pogodaev.leetcode.TreeNode;

/**
 * Given the root of a binary tree, return the sum of all left leaves.
 * <p>
 * A leaf is a node with no children.
 * A left leaf is a leaf that is the left child of another node.
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int result = 0;

        if (root != null) {
            if (isLeaf(root.left)) {
                result += root.left.val;
            } else {
                result += sumOfLeftLeaves(root.left);
            }

            result += sumOfLeftLeaves(root.right);
        }
        return result;
    }

    boolean isLeaf(TreeNode node) {
        if (node == null) return false;
        return node.left == null && node.right == null;
    }

}
