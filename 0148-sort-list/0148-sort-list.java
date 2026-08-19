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
    // private static ListNode Array2LinkedList(int[] arr){
    //     ListNode head = new ListNode(arr[0]);
    //     ListNode temp = head;
    //     for(int i = 1; i<arr.length; i++){
    //         ListNode nextNode = new ListNode(arr[i]);
    //         temp.next = nextNode;
    //         temp = nextNode;
    //     }
    //     return head;
    // }

    private static ListNode middle(ListNode head){
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private static ListNode mergeLL(ListNode head1, ListNode head2){
        if(head1 == null || head2 == null) return null;

        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                temp.next = head1;
                temp = head1;
                head1 = head1.next;
            }else{
                temp.next = head2;
                temp = head2;
                head2 = head2.next;                
            }
        }
        if(head1 != null) temp.next = head1;
        else temp.next = head2;

        return dummyNode.next;
    }
    public ListNode sortList(ListNode head) {        
        if(head == null || head.next == null) return head;
        ListNode mid = middle(head);

        ListNode leftHead = head;
        ListNode rightHead = mid.next;
        
        mid.next = null;

        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);

        return mergeLL(leftHead, rightHead);
    }
}