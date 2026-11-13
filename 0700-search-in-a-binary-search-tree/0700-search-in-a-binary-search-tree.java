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
    public TreeNode recursive(TreeNode root, int val){
        if(root == null || root.val == val) return root;
        if(root.val > val) return recursive(root.left, val);
        else return recursive(root.right, val);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        // while(root != null){
        //     if(root.val == val) return root;
        //     root = val < root.val ? root.left : root.right;
        // }
        // return null;
        return recursive(root, val);
    }
}