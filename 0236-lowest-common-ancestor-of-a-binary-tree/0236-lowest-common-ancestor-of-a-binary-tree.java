/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return findLowestCommonAncestor(root, p, q);
    }
    public TreeNode findLowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        if(node == null)
            return null;
        TreeNode left = findLowestCommonAncestor(node.left, p, q);
        TreeNode right = findLowestCommonAncestor(node.right, p, q);
        
        if(node.val == p.val || node.val == q.val)
            return node;

        // value and 0 or 0 and value --> value
        // value and value --> node.val
        // 0 and 0 --> 0
        if(left != null && right == null) 
            return left;
        else if(left == null && right != null)
            return right;
        else if(left == null && right == null)
            return null;
        else
            return node;
    }
}