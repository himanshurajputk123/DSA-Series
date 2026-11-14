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
    int sum = Integer.MIN_VALUE;
    public int helper(TreeNode root){
        if(root == null) return 0;
        int ls = Math.max(0, helper(root.left));
        int rs = Math.max(0, helper(root.right));
        sum = Math.max(sum, ls + rs + root.val);
        return Math.max(ls, rs) + root.val;
    }
    public int maxPathSum(TreeNode root) {
        int value = helper(root);
        return sum;
    }
}