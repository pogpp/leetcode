package ru.pogodaev.leetcode.n110;

import ru.pogodaev.leetcode.TreeNode;


/**
 * Given a binary tree, determine if it is height-balanced.
 * <p>
 * For this problem, a height-balanced binary tree is defined as:
 * <p>
 * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 */

public class BalancedBT {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return height(root) != -1;
    }

    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int lH = height(node.left);
        if (lH == -1) {
            return -1;
        }

        int rH = height(node.right);
        if (rH == -1) {
            return -1;
        }

        if (lH - rH < -1 || lH - rH > 1) {
            return -1;
        }

        return Math.max(lH, rH) + 1;
    }
}
