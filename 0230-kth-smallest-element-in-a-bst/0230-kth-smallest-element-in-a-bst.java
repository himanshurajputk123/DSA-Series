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

    public void preOrderTraverse(TreeNode root, List<Integer> ls){
        if(root == null) return;
        ls.add(root.val);
        preOrderTraverse(root.left, ls);
        preOrderTraverse(root.right, ls);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ls = new ArrayList<>();
        preOrderTraverse(root, ls);
        Collections.sort(ls);
        return ls.get(k-1); // O(N + NlogN) // Extra space of O(N);
    }
}