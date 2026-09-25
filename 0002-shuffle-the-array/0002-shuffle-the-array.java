class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int ptr1 = 0;
        int ptr2 = n;
        int i = 0;
        while(ptr1 < n && ptr2 < nums.length && i < nums.length){
            ans[i] = nums[ptr1];
            ptr1++;
            i++;
            ans[i] = nums[ptr2];
            ptr2++;
            i++;

        }
        return ans;
    }
}