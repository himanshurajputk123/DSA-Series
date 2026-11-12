class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int cntInc = 1;
        int cntDec = 1;
        int len = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] < nums[i-1]){
                cntDec++;
                cntInc = 1;
            }
            else if(nums[i] > nums[i-1]){
                cntInc++;
                cntDec = 1;
            }
            else{
                cntDec = 1;
                cntInc = 1;
            }
            len = Math.max(len, (Math.max(cntInc, cntDec)));
        }
        return len;
    }
}