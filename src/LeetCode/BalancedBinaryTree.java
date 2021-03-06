package LeetCode;

import LeetCode.util.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.

 For this problem, a height-balanced binary tree is defined as:

 a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

 Example 1:

 Given the following tree [3,9,20,null,null,15,7]:

 3
 / \
 9  20
 /  \
 15   7
 Return true.

 Example 2:

 Given the following tree [1,2,2,3,3,null,null,4,4]:

 1
 / \
 2   2
 / \
 3   3
 / \
 4   4
 Return false.
 */

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(treeDepth(root.left) - treeDepth(root.right)) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right)) {
            return true;
        }
        return false;
    }

    private int treeDepth (TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(treeDepth(root.left), treeDepth(root.right));
    }

    public static void main(String[] args) {
        BalancedBinaryTree b = new BalancedBinaryTree();
        Integer[] is = {3,9,20,null,null,15,7};
        Integer[] is2 = {1,2,2,3,3,null,null,4,4};
        TreeNode root = new TreeNode(is2).getRoot();
        System.out.println(b.isBalanced(root));
    }
}
