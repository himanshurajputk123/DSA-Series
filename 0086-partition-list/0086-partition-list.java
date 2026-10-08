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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode list = new ListNode(-1);
        ListNode tempList = list;

        ListNode temp = head;
        ListNode dummyNode = new ListNode(-1);
        ListNode prev = dummyNode;
        prev.next = head;

        while(temp != null){            
            if(temp.val < x){
                tempList.next = temp;
                tempList = temp;
                prev.next = temp.next;
                temp = temp.next;                
            }else{
                prev = temp;
                temp = temp.next;
            }

        }
        tempList.next = null;

        prev = dummyNode.next;

        // while(temp.next != null){
        //     if(temp.val >= x){
        //         prev.next = list.next;
        //         tempList.next = temp;

        //     }else{
        //         prev = temp;
        //         temp = temp.next;
        //     }
        // }

        tempList.next = prev;
        return list.next;
        //return head;
    }
}