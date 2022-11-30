package ru.pogodaev.leetcode.n938;

import ru.pogodaev.leetcode.TreeNode;

public class BSTRange {

    public int rangeSumBST(TreeNode root, int L, int R) {

        int mySum, leftSum, rightSum;

        // Return solution
        if (root == null) {
            mySum = 0;        // Solution for the base case
        } else {
            leftSum = rangeSumBST(root.left, L, R);      // Solve smaller problem 1
            rightSum = rangeSumBST(root.right, L, R);     // Solve smaller problem 2

            if (root.val >= L && root.val <= R) {
                mySum = root.val + leftSum + rightSum;
            } else {
                mySum = leftSum + rightSum;
            }
            // Solve my problem using
            // solution of smaller problem
        }
        return mySum;     // Return solution
    }
}
