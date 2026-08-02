class Solution {
    // T.C O(2^n); i.e exponential 
    // T.L.E
    // Do this question after DP as well
    public static int score(int[] nums, int left, int right, Integer[][] dp){
        // why Integer instead of int ==> 'Intger' will store null
        // while 'int' store 0 <===> if actual ans comes to be 0 
        // then how do we get to know whether this 0 is computed and stored by us or already stored in int[][]
        

        if(left == right) return nums[left];
        if(dp[left][right] != null){
            return dp[left][right];
        }
        int leftPick = nums[left] - score(nums, left+1, right, dp);
        int rightPick = nums[right] - score(nums, left, right-1, dp);
        dp[left][right] = Math.max(leftPick, rightPick);
        return dp[left][right];
    }

    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        Integer[][] dp = new Integer[n][n];
        int ans = score(piles, 0, n - 1, dp);
        if(ans >= 0) return true;
        else return false;
    }
}