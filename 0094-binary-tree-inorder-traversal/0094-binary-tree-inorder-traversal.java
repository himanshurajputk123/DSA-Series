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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;
        while(true){
            // agr node null nhi hai?
            if(node != null){
                // push in stack
                st.push(node);
                // and move left
                node = node.left;
            }else{
                // sbse phle check kro kya stack null toh nhi hai?
                if(st.isEmpty()) break; // agr empty hai toh breakout krdo loop se
                // agr node null hai toh?
                // toh stack ko pop() kro
                node = st.pop();
                // and  list me add kro
                ls.add(node.val);
                // then node ko right move kro
                node = node.right;
            }
        }
        return ls;
        
    }
}