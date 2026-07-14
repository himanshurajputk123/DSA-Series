class Solution {
    static boolean isValidAns(int[] nums, int k, int maxSum){
        int n = nums.length;

        int splitCount = 1;
        int sum = 0;

        for(int i = 0; i<n ; i++){
            if(sum + nums[i] <= maxSum){
                sum += nums[i];
            }
            else{
                splitCount++;
                if(splitCount > k || nums[i]> maxSum){
                    return false;
                }
                else{
                    sum = 0;
                    sum += nums[i];
                }
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int s = 0;

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        int e = sum;
        int ans = -1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(isValidAns(nums, k, mid)){
                ans = mid;
                e = mid - 1;
            } else s = mid + 1;
        }
        return ans;
    }
}