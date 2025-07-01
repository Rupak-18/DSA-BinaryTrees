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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null)
            return answer;
        queue.offer(root);
        int flag = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
           
            for(int i=0; i<size; i++) {
                TreeNode node = queue.poll();
                if(node.left != null)   
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
                temp.add(node.val);
            }
            if(flag == 1)
                Collections.reverse(temp);
            flag = flag ^ 1;
            answer.add(temp);
        }
        return answer;
    }
}