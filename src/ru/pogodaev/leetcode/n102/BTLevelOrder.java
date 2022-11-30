package ru.pogodaev.leetcode.n102;

import ru.pogodaev.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//breadth-first search
public class BTLevelOrder {

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
        root.right.right = new TreeNode();
        root.right.right.val = 5;
//        levelOrder(root);

        levelOrderQu(root);

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        levelOrderHelper(res, root, 0);
        return res;
    }


    public static void levelOrderHelper(List<List<Integer>> res, TreeNode root, int level) {
        if (root == null) {
            return;
        }
        List<Integer> curr;
        if (level >= res.size()) {
            curr = new ArrayList<>();
            curr.add(root.val);
            res.add(curr);
        } else {
            curr = res.get(level);
            curr.add(root.val);
            //res.add(curr); // No need to add the curr into the res, because the res.get(index) method does not remove the index element
        }
        levelOrderHelper(res, root.left, level + 1);
        levelOrderHelper(res, root.right, level + 1);
    }

    public static List<List<Integer>> levelOrderQu(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> currLevel = new ArrayList<>();
            System.out.println("\nlevel size " + levelSize);

            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = q.poll();
                System.out.print(currNode.val + " ");

                currLevel.add(currNode.val);

                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }

            res.add(currLevel);
        }
        return res;
    }


}
