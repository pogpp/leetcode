package ru.pogodaev.leetcode.n94;

import ru.pogodaev.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
public class BTInorderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 0;
        root.left = new TreeNode();
        root.left.val = 1;
        root.left.left = new TreeNode();
        root.left.left.val = 2;
        root.left.right = new TreeNode();
        root.left.right.val = 3;
        root.right = new TreeNode();
        root.right.val = 4;
        inorderTraversal(root);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) return result;

        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                result.add(root.val);
                root = root.right;
            }
        }
        return result;
    }
}
