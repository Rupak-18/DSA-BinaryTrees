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
        if(root == null || (root.left == null && root.right == null))
            return 0;
        int[] sum = new int[1];
        findSumOfLeftLeaves(root, sum, true);
        return sum[0];
    }
    public int findSumOfLeftLeaves(TreeNode root, int[] sum, boolean flag) {
        if(root == null)
            return 0;
        findSumOfLeftLeaves(root.left, sum, true);
        findSumOfLeftLeaves(root.right, sum, false);
        
        if(flag && root.left == null && root.right == null)
            sum[0] += root.val;

        return 1;
    }
}