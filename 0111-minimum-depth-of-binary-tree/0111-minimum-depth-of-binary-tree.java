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
    //      RECURSIVE SOLUTION
    //      ------------------
    // public int minDepth(TreeNode root) {
    //     if(root == null)
    //         return 0;
    //     int[] depth = new int[1];
    //     depth[0] = Integer.MAX_VALUE;
    //     findMinDepth(root, depth, 1);
    //     return depth[0];
    // }
    // private void findMinDepth(TreeNode node, int[] depth, int level) {
    //     if(node == null) 
    //         return;
    //     if(node.left == null && node.right == null) 
    //         depth[0] = Math.min(depth[0], level);
    //     findMinDepth(node.left, depth, level+1);
    //     findMinDepth(node.right, depth, level+1);
    // }

    //      ITERATIVE SOLUTION
    //      ------------------
    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int depth = 0;
        boolean flag = false;
        if (root == null)
            return depth;

        queue.offer(root);
        while (!queue.isEmpty()) {
            int level = queue.size();

            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll(); 
                
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                if(node.left == null && node.right == null) 
                    flag = true;
            }
            depth++;
            if(flag)
                break;
        }
        return depth;
    }
}