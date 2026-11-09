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
    public void recursiveSol(TreeNode root, List<Integer> ls){
        if(root == null) return;
        // root
        ls.add(root.val);
        // left
        recursiveSol(root.left, ls);
        // right
        recursiveSol(root.right, ls);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
    /*    if(root == null) return ls;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            ls.add(node.val);
            if(node.right != null) st.push(node.right);
            if(node.left != null) st.push(node.left);

        }
    */
        if(ls == null) return ls;
        recursiveSol(root, ls);
        return ls;
    }
}