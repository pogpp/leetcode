package ru.pogodaev.leetcode.n606;

import ru.pogodaev.leetcode.TreeNode;

public class TreeToString {

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 1;

        TreeNode l1 = new TreeNode();
        l1.val = 2;

        TreeNode r1 = new TreeNode();
        r1.val = 3;

        TreeNode l2 = new TreeNode();
        l2.val = 4;

        l1.left = l2;

        root.left = l1;
        root.right = r1;

        System.out.println(tree2str(root));
    }

    public static String tree2str(TreeNode t) {
        StringBuilder ans = new StringBuilder();
        dfs(ans, t);
        return ans.toString();
    }


    private static String order(TreeNode node, String str) {
        if (node == null) {
            return str;
        }

        str = str + node.val;
        if (node.left == null) {
            str = "(" + str;
        }
        if (node.right == null) {
            str = str + ")";
        }

        str = order(node.left, str);
        str = order(node.right, str);

        return str;
    }


    private static void dfs(StringBuilder ans, TreeNode t) {
        if (t == null) {
            return;
        }
        ans.append(t.val);
        if (t.right != null) {
            // if the right child isn't empty, we still need to append '()' although the left child is empty
            dfs(ans.append('('), t.left);
            ans.append(')');
            dfs(ans.append('('), t.right);
            ans.append(')');
        } else if (t.left != null) {
            dfs(ans.append('('), t.left);
            ans.append(')');
        }
    }



}
