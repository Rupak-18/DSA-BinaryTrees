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
    public void preorderHelper(TreeNode root, List<Integer> answer) {
        if(root == null) 
            return;
        answer.add(root.val);
        preorderHelper(root.left, answer);
        preorderHelper(root.right, answer);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        preorderHelper(root, answer);
        return answer;
    }
}