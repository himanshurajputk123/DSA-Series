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
    int ans = -1;
    int cnt = 0;
    // why inOrder? as inOrder gives us the sorted order of numbers
    public void inOrder(TreeNode root, int k){
        if(root == null) return;
        // left
        inOrder(root.left, k);
        // node
        cnt++;
        if(cnt == k) {
            ans = root.val;
            return;
        }
        // right
        inOrder(root.right, k);
        
    }
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return ans;
    }
}