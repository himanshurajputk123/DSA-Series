class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        int n = nums.length;
        Stack<Long> st = new Stack<>();
        for(int i = 0; i < n; i++){
            long curr = nums[i];
            while(!st.isEmpty() && st.peek() == curr){
                curr += st.pop();
            }
            st.push(curr);
        }
        return new ArrayList<>(st);

    }
}