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
    public List<Integer> rightSideView(TreeNode root) {
        int level = 0;
        List<Integer> answer = new ArrayList<>();
        rightSide(root, level, answer);
        return answer;
    }
    public void rightSide(TreeNode node, int level, List<Integer> answer) {
        if(node == null)
            return;
        if(level == answer.size())
            answer.add(node.val);
        rightSide(node.right, level+1, answer);
        rightSide(node.left, level+1, answer);
    }
}