package ru.pogodaev.leetcode.n144;

import ru.pogodaev.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTPreorderTraversal {

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
        preorderTraversal(root);
        rec(root);

        List<Integer> list = new ArrayList<>();

        List<Integer> mem = recMem(root, list);

        for (int k : mem) System.out.println(k);

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) return result;

        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            result.add(root.val);

            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return result;
    }

    public static void rec(TreeNode root) {

        if (root == null) return;

        System.out.println(root.val);
        rec(root.left);
        rec(root.right);

    }

    public static List<Integer> recMem(TreeNode root, List<Integer> list) {

        if (root == null) return list;

        list.add(root.val);

        recMem(root.left, list);
        recMem(root.right, list);

        return list;
    }


}
