class Solution {
    public int jump(int[] nums) {
        int cnt = 0;
        int maxIdx = 0;
        int end = 0;
        for(int i = 0; i < nums.length - 1; i++){            
            maxIdx = Math.max(maxIdx, i+nums[i]);
            if(i == end){
                cnt++;
                end = maxIdx;
            }
        }
        return cnt;
    }
}