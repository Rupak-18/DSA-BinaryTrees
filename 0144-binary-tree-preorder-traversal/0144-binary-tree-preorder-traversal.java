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



//---------- RECURSIVE METHOD ------------

// class Solution {
//     public void preorderHelper(TreeNode root, List<Integer> answer) {
//         if(root == null) 
//             return;
//         answer.add(root.val);
//         preorderHelper(root.left, answer);
//         preorderHelper(root.right, answer);
//     }

//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> answer = new ArrayList<>();
//         preorderHelper(root, answer);
//         return answer;
//     }
// }


//---------- ITERATIVE METHOD ------------


class Solution {

    public void preOrderHelper(TreeNode root, List<Integer> answer) {
        if(root == null)
            return;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode node = st.pop();
            answer.add(node.val);
            if(node.right != null)
                st.push(node.right);
            if(node.left != null)
                st.push(node.left);    
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        preOrderHelper(root, answer);
        return answer;
    }
}