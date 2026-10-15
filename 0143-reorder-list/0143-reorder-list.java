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

    /*
    1. Find middle → slow/fast pointers
    2. Reverse second half → your linked-list reversal
    3. Merge two halves alternately → pointer manipulation
    */
    public static ListNode findMid(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;            
        }
        return slow;
    }
    public ListNode reverseLL(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode newHead = reverseLL(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode mid = findMid(head);
        
        ListNode temp1 = head;
        ListNode temp2 = mid.next;
        mid.next = null;
        temp2 = reverseLL(temp2);

        while(temp1 != null && temp2 != null){
            ListNode next1 = temp1.next;
            ListNode next2 = temp2.next;
            temp1.next = temp2;            
            temp2.next = next1;
            temp1 = next1;
            temp2 = next2;
        }
        
    }
}