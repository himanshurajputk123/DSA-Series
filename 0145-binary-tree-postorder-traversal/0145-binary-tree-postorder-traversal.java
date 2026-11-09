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
        // left
        recursiveSol(root.left, ls);
        // right
        recursiveSol(root.right, ls);
        // root 
        ls.add(root.val);
    }
    public void usingTwoStack(TreeNode root, List<Integer> ls){
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);
        TreeNode node = root;
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.push(root);
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st1.push(root.right);
        }
        while(!st2.isEmpty()){
            ls.add(st2.pop().val);
        }
    }
    // public void usingOneStack(TreeNode root, List<Integer> ls){
    //     Stack<Integer> st = new Stack<>();

    // }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        if(root == null) return ls;
        //recursiveSol(root, ls);
        usingTwoStack(root, ls);
        return ls;
        
    }
}