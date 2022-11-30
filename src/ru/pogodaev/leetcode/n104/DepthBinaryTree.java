package ru.pogodaev.leetcode.n104;

import ru.pogodaev.leetcode.TreeNode;

public class DepthBinaryTree {


    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        } else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
}
