class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        // but this solution takes O(n)
        // int xor = 0;
        // for(int i = 0; i<n; i++){
        //     xor ^= nums[i];
        // }
        // return xor;

        // optimal solution using Binary Search
        int s = 1;
        int e = n - 2;

        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];


        while(s <= e){
            int mid = s + (e - s)/2;
            
            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                // single number found;
                return nums[mid];
            }
            // left half (Even, Odd)
            if(mid % 2 == 0 && nums[mid] == nums[mid + 1]
                || mid % 2 != 0 && nums[mid] == nums[mid - 1]){
                    s = mid + 1;
            }
            if(mid % 2 != 0 && nums[mid] == nums[mid + 1]
                || mid % 2 == 0 && nums[mid] == nums[mid - 1]){
                    e = mid - 1;
            }
            
        }
        return -1;
    }
}