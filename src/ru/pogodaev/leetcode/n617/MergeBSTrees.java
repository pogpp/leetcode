package ru.pogodaev.leetcode.n617;

import ru.pogodaev.leetcode.TreeNode;

import java.util.Stack;

public class MergeBSTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode result = new TreeNode(0);

        if (t1 == null && t2 == null)
            return null;
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;

        stack.push(result);
        stack.push(t1);
        stack.push(t2);

        while (!stack.isEmpty()) {
            TreeNode p2 = stack.pop();
            TreeNode p1 = stack.pop();
            TreeNode p = stack.pop();

            p.val = p1.val + p2.val;

            if (p1.left != null || p2.left != null) {
                if (p1.left == null) {
                    p.left = p2.left;
                } else if (p2.left == null) {
                    p.left = p1.left;
                } else {
                    p.left = new TreeNode(0);
                    stack.push(p.left);
                    stack.push(p1.left);
                    stack.push(p2.left);
                }
            }

            if (p1.right != null || p2.right != null) {
                if (p1.right == null) {
                    p.right = p2.right;
                } else if (p2.right == null) {
                    p.right = p1.right;
                } else {
                    p.right = new TreeNode(0);
                    stack.push(p.right);
                    stack.push(p1.right);
                    stack.push(p2.right);
                }
            }
        }

        return result;
    }

}
