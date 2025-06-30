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
    public TreeNode invertTree(TreeNode root) {
        invertion(root);
        return root;
    }
    public void invertion(TreeNode root) {
        if(root == null || (root.right == null && root.left == null))
            return;
        
        invertion(root.left);
        invertion(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}