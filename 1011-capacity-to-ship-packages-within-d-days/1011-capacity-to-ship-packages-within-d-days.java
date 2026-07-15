class Solution {
    static int reqDays(int[] nums, int cap){
        int days = 1;
        int load = 0;
        for(int i = 0; i<nums.length; i++){
            if(load + nums[i] > cap){
                days += 1;
                load = nums[i];
            }
            else load += nums[i];
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int ans = -1;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<n; i++){
            maxi = Math.max(maxi, weights[i]);
            sum += weights[i];
        }
        int s = maxi; 
        int e = sum;

        while(s <= e){
            int mid = s + (e - s)/2;
            int noOfDays = reqDays(weights, mid);
            if(noOfDays <= days){
                ans = mid;
                e = mid - 1;
            } else s = mid + 1;
        }
        return ans;
    }
}