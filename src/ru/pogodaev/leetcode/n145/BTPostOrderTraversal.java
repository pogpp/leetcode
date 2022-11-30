package ru.pogodaev.leetcode.n145;

import ru.pogodaev.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTPostOrderTraversal {

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
        postorderTraversal(root);
//        rec(root);
//
//        List<Integer> list = new ArrayList<>();
//
//        List<Integer> mem = recMem(root, list);
//
//        for (int k : mem) System.out.println(k);

    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode lastNodeVisited = null;

        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode peekNode = stack.peek();
                if (peekNode.right != null && lastNodeVisited != peekNode.right) {
                    root = peekNode.right;
                } else {
                    result.add(peekNode.val);
                    System.out.println(peekNode.val);
                    lastNodeVisited = stack.pop();
                }
            }
        }
        return result;
    }
}
