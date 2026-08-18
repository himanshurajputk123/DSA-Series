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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        int len = 1; 
        ListNode tail = head;

        while(tail.next != null){
            len += 1;
            tail = tail.next;
        }
        k = k % len;
        if(k == 0) return head;
        
        tail.next = head; 

        int diff = len - k;
        diff--;
               
        ListNode temp = head;
        while(diff > 0){
            temp = temp.next;
            diff--;
        }
        ListNode newHead = temp.next;
        temp.next = null;
        return newHead;        
    }
}