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

// ------ RECURSIVE METHOD (2 STACK) --------

// class Solution {
//     public void postorderHelper(TreeNode root, List<Integer> answer) {
//         if(root == null) 
//             return;
//         postorderHelper(root.left, answer);
//         postorderHelper(root.right, answer);
//         answer.add(root.val);
//     }

//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> answer = new ArrayList<>();
//         postorderHelper(root, answer);
//         return answer;
//     }
// }

// ------ ITERATIVE METHOD (2 STACK) --------

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        if(root == null)
            return answer;

        TreeNode node = root;
        st1.push(node);

        while(!st1.isEmpty()) {
            node = st1.pop();
            st2.push(node);
            if(node.left != null)
                st1.push(node.left);
            if(node.right != null)
                st1.push(node.right);
        }
        while(!st2.isEmpty()) 
            answer.add(st2.pop().val);
        return answer;
    }
}