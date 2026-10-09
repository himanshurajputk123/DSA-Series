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
    // public boolean search(int[] nums, int x){
    //     int n = nums.length;
    //     for(int i = 0; i < n; i++){
    //         if(nums[i] == x) return true;
    //     }
    //     return false;
    // }
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head == null) return null;

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) set.add(nums[i]);

        ListNode dummy = new ListNode(-1);
        ListNode temp = head;
        ListNode prev = dummy;
        prev.next = temp;
        
        while(temp != null){
            int val = temp.val;
            if(set.contains(val)){
                prev.next = temp.next;
                temp = temp.next;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }

        return dummy.next;
    }
}