class Solution {
    public int maxValidPairSum(int[] nums, int k) {
       int n = nums.length;
       int maxSum = -1;
       // bruteForce
    //    for(int i = 0; i<n; i++){
    //     int sum = 0;
    //     for(int j = k; j<n; j++){
    //         if((j - i) >= k){
    //             sum = nums[i] + nums[j];
    //             maxSum = Math.max(maxSum, sum);
    //         }
    //     }
    //    }

        // optimal
        int maxLeft = nums[0];
        for(int j = k; j<n; j++){
            maxLeft = Math.max(maxLeft, nums[j - k]);
            maxSum = Math.max(maxSum, maxLeft + nums[j]);
        }
       return maxSum;
    }
}