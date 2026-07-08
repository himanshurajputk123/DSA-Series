class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int s = 0;
        int e = n - 1;


        while( s <= e){
            int mid = s + (e - s)/2;

            if(nums[s] <= nums[e]){
                ans = Math.min(ans, nums[s]);
                break;
            }

            if(nums[s] <= nums[mid]){
                ans = Math.min(ans, nums[s]);
                s = mid + 1;
            } else {
                e = mid - 1;
                ans = Math.min(ans, nums[mid]); 
            }
        }
        return ans;
    }
}