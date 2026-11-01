class Solution {
    public int optimised(int[] nums){
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        for (int num :  nums){
            if (num >= max){
                max = num;
                cnt++;
            }
        }
        return cnt;
    }
    public int maximumPossibleSize(int[] nums) {
        // Stack<Integer> st = new Stack<>();
        // int n = nums.length;
        // for(int i = n - 1; i >= 0; i--){
        //     while(!st.isEmpty() && st.peek() < nums[i]){
        //         st.pop();
        //     }
        //     st.push(nums[i]);
        // }
        //return st.size();
        return optimised(nums);
    }
}