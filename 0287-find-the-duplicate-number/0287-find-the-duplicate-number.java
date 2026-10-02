class Solution {
    public int count(int[] nums, int mid){
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= mid) cnt++;
        }
        return cnt;
    }
    public int findDuplicate(int[] nums) {
        int n = nums.length - 1;
        int s = 1;
        int e = n;
        while(s <= e){
            int mid = s + (e - s)/2;
            int cnt = count(nums, mid);
            if(cnt > mid){
                e = mid - 1;
                
            }
            else s = mid + 1;
        }
        return s;

    }
}