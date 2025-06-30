/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int[] sum = new int[1];
        dfs(root, sum, false);  // root is not a left leaf
        return sum[0];
    }

    private void dfs(TreeNode node, int[] sum, boolean isLeft) {
        if (node == null) return;

        if (node.left == null && node.right == null && isLeft) {
            sum[0] += node.val;
            return;
        }

        dfs(node.left, sum, true);   // mark left traversal
        dfs(node.right, sum, false); // mark right traversal
    }
}
