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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>(); 
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null)
            return answer;

        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>(); 
            int level = queue.size();

            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll(); 
                
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                
                temp.add(node.val);
            }
            answer.add(0, temp);
        }
        return answer;
    }
}