class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        int minIdx = -1;
        for(int i = 0; i<n; i++){
            if(nums[i] < min){
                min = nums[i];
                minIdx = i;
            }
            if(nums[i] > max){
                max = nums[i];
                maxIdx = i;
            }
        }
        int right = Math.max(minIdx, maxIdx);
        int left = Math.min(minIdx, maxIdx);
        
        // scenario 1 => Both from front;
        int fromLeft = right + 1;            

        // scenario 2 => Both from back;
        int fromRight = n - left;
            
        // scenario 3 => one from front & one from back;
        int fromBoth = (left + 1) + (n - right);

        return Math.min(fromBoth, Math.min(fromLeft, fromRight));
    }
}