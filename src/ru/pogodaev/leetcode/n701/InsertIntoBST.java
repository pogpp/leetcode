package ru.pogodaev.leetcode.n701;

import ru.pogodaev.leetcode.TreeNode;

public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        //tree is empty
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        //traverse the tree
        if (val < root.val) {    //insert in the left subtree
            root.left = insertIntoBST(root.left, val);
        } else if (val > root.val) {   //insert in the right subtree
            root.right = insertIntoBST(root.right, val);
        }
        // return pointer
        return root;
    }
}
