/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode createdLL(Stack<Integer> st){
        //ListNode dummyNode = new Node(-1);
        ListNode head = new ListNode(st.pop());
        head.next = null;
        while(!st.isEmpty()){
            ListNode temp = new ListNode(st.pop());
            temp.next = head;
            head = temp;
        }
        return head;
    }
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            while(!st.isEmpty() && st.peek() < temp.val){
                st.pop();
            }
            st.push(temp.val);
            temp = temp.next;
        }
        if(!st.isEmpty()) return createdLL(st);
        return head;
        
    }
}