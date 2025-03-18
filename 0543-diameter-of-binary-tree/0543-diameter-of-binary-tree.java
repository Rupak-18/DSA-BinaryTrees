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
    public int maxi;

    public int findDiameter(TreeNode root) {
        if(root == null)
            return 0;
        
        int leftHeight = findDiameter(root.left);
        int rightHeight = findDiameter(root.right);

        maxi = Math.max(maxi, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        findDiameter(root);
        return maxi;
    }
}