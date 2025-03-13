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
    public void postorderHelper(TreeNode root, List<Integer> answer) {
        if(root == null) 
            return;
        postorderHelper(root.left, answer);
        postorderHelper(root.right, answer);
        answer.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        postorderHelper(root, answer);
        return answer;
    }
}