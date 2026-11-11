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
    public int heightMax(TreeNode root){
        if(root == null) return 0;
        // left height
        int lh = heightMax(root.left);
        if(lh == -1) return -1;
        // right height
        int rh = heightMax(root.right);
        if(rh == -1) return -1;
        // check
        if(Math.abs(rh - lh) > 1) return -1;
        return Math.max(rh, lh) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return heightMax(root) != -1;
    }
}