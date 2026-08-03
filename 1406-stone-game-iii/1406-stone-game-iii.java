class Solution {
    public int solve(int [] nums, int i, Integer[] dp){
        int n = nums.length;
        if((i >= n) ) return 0;
        if(dp[i] != null) return dp[i]; // 2

        int pickOne = nums[i] - solve(nums, i + 1, dp);

        int pickTwo = Integer.MIN_VALUE;
        if((i + 1) < n) pickTwo = nums[i] + nums[i+1] - solve(nums, i + 2, dp);

        int pickThree = Integer.MIN_VALUE;
        if((i + 2) < n) pickThree = nums[i] + nums[i+1] + nums[i+2] - solve(nums, i + 3, dp);

        int max1 = Math.max(pickOne, pickTwo);
        dp[i] = Math.max(max1, pickThree); // 3
        return dp[i]; // 4
    }
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        Integer[] dp = new Integer[n]; // 1
        int ans = solve(stoneValue, 0, dp);
        if(ans > 0) return "Alice";
        else if(ans < 0) return "Bob";
        else return "Tie";
    }
}