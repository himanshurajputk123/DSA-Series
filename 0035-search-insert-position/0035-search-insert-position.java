class Solution {
    public int searchInsert(int[] nums, int target) {
        /*
        NOTE:
        For insertion-type binary search:
        If you find the target, return mid.
        If you don't find it, the loop ends with s > e.
        At that moment:
        s is the first index where the target can be inserted.
        e is the last index with a value smaller than the target.
        */
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        while(s<=e){
            int mid = s + (e - s)/2;
            if(nums[mid] < target){
                s = mid + 1;
            } else if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                e = mid - 1;
            }
        }
        return s;
    }
}