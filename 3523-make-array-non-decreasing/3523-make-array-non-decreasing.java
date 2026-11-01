class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() < nums[i]){
                st.pop();
            }
            st.push(nums[i]);
        }
        return st.size();
    }
}