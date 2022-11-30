package ru.pogodaev.leetcode.n101;

import ru.pogodaev.leetcode.TreeNode;

//check if tree is Symmetric

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        return mirror(root, root);
    }


    private boolean mirror(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }

        // Divide
        boolean left = mirror(root1.left, root2.right);
        boolean right = mirror(root1.right, root2.left);
        // Conquer
        return left && right;
    }


}
