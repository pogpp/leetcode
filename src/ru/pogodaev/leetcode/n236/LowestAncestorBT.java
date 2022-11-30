package ru.pogodaev.leetcode.n236;

import ru.pogodaev.leetcode.TreeNode;

public class LowestAncestorBT {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null)
            return right;
        else if (right == null)
            return left;
        else
            return root;
    }


    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        } else {
            if (root == p) {
                return p;
            }
            if (root == q) {
                return q;
            }
            TreeNode left = lowestCommonAncestor2(root.left, p, q);
            TreeNode right = lowestCommonAncestor2(root.left, p, q);

            if (left != null && right != null) {
                return root;
            }
            return left == null ? right : left;
        }
    }
}
