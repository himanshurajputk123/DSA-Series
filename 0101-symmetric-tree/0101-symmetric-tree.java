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
    public boolean isMirror(TreeNode nodeLeft, TreeNode nodeRight){
        if(nodeLeft == null && nodeRight == null) return true;
        if(nodeLeft == null || nodeRight == null) return false;
        return nodeLeft.val == nodeRight.val && (isMirror(nodeLeft.left, nodeRight.right) && isMirror(nodeLeft.right, nodeRight.left));
    }
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
}