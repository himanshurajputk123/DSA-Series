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
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        
        if(temp == null || temp.next == null) return temp;

        ListNode newHead = head.next;
        ListNode second = temp.next;
        // ek case mein solve krunga baki recursion sambhaal lega
        ListNode  rest =  swapPairs(temp.next.next);
        second.next = temp;
        temp.next = rest;
        
        return newHead;
    }
}