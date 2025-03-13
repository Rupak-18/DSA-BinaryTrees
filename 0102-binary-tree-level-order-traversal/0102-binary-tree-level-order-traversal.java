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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new LinkedList<List<Integer>>();
        Queue<TreeNode> qp = new LinkedList<TreeNode>();
        if(root == null)
            return answer;
        qp.offer(root);
        while(!qp.isEmpty()) {
            int levelNum = qp.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i = 0; i < levelNum; i++) {
                if(qp.peek().left != null)
                    qp.offer(qp.peek().left);
                if(qp.peek().right != null)
                    qp.offer(qp.peek().right);
                subList.add(qp.poll().val);
            }
            answer.add(subList);
        }
        return answer;
    }
}