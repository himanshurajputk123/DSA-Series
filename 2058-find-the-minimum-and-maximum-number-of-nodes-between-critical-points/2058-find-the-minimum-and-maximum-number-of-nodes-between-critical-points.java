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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int cpCount = 0;
        ListNode temp = head.next;
        ListNode prev = head;
        int i = 1;
        List<Integer> list = new ArrayList<>();
        while(temp.next != null){
            ListNode next = temp.next;
            if((temp.val > next.val && temp.val > prev.val)
                    || (temp.val < next.val && temp.val < prev.val)){
                i++;
                list.add(i);                
                cpCount++;
            }
            else i++;
            temp = temp.next;
            prev = prev.next;
        }
                if (list.size() < 2) {
            return new int[]{-1, -1};
        }

        int min = Integer.MAX_VALUE;

        for (int j = 1; j < list.size(); j++) {
            min = Math.min(min, list.get(j) - list.get(j - 1));
        }

        int max = list.getLast() - list.getFirst();


        return new int[] {min, max};

    }

}