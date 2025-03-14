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

// -------- RECURSIVE METHOD ---------

// class Solution {
//     public void inorderHelper(TreeNode root, List<Integer> answer) {
//         if(root == null) 
//             return;
//         inorderHelper(root.left, answer);
//         answer.add(root.val);
//         inorderHelper(root.right, answer);
//     }

//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> answer = new ArrayList<>();
//         inorderHelper(root, answer);
//         return answer;
//     }
// }

// -------- ITERATIVE METHOD ---------

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null)
            return answer;
        TreeNode node = root;

        while(true) {
            if(node != null) {
                st.push(node);
                node = node.left;
            }
            else {
                if(st.isEmpty())
                    break;
                node = st.pop();
                answer.add(node.val);
                node = node.right;
            }
        }
        return answer;
    }
}