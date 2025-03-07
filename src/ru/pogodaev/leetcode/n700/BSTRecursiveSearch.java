package ru.pogodaev.leetcode.n700;

import ru.pogodaev.leetcode.TreeNode;

public class BSTRecursiveSearch {


    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 4;
        root.left = new TreeNode();
        root.left.val = 2;
        root.left.left = new TreeNode();
        root.left.left.val = 1;
        root.left.right = new TreeNode();
        root.left.right.val = 3;
        root.right = new TreeNode();
        root.right.val = 7;

        TreeNode treeNode = searchBST(root, 2);
        System.out.println("node " + treeNode.val);
    }

    public static TreeNode searchBST(TreeNode root, int val) {

        if (root == null) return null;

        if (root.val == val) {
            return root;
        } else if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }


    }
}
