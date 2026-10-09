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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int cnt = 0;
        ListNode temp = list1;
        ListNode last = list2;
        while(last.next != null) last = last.next;
        while(temp != null){
            if(cnt == a - 1){
                ListNode next = temp.next;
                ListNode prev = temp;
                prev.next = list2;
                cnt++;
                temp = next;
            }
            else if(cnt == b + 1){
                //ListNode next = temp.next;
                last.next = temp;
                break;
                
            }
            else{
                cnt++;
                temp = temp.next;
            }    
        }
        return list1;

    }
}