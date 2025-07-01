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
        // Base case: if current node is null or matches either p or q
        if (node == null || node == p || node == q)
            return node;

        // Recursively search in left and right subtrees
        TreeNode left = findLowestCommonAncestor(node.left, p, q);
        TreeNode right = findLowestCommonAncestor(node.right, p, q);

        /*
        Case 1: One side returns a node, the other returns null
             => Return the non-null side (value and 0 → value)
         
        Case 2: Both sides return non-null nodes
             => Return current node (value and value → node)

        Case 3: Both sides return null
             => Neither p nor q found in this path (0 and 0 → 0)
        */

        if (left != null && right != null)
            return node;

        return (left != null) ? left : right;
    }
}
