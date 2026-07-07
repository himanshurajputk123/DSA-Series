class Solution {
    // pivot
    int pivotIndex(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = nums.length - 1;
        int ans = -1;

        // wrong 
        if (nums[s] < nums[e]) {
            return ans;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] <= nums[n - 1]) {
                e = mid - 1;
            } else if (nums[mid] > nums[n - 1]) {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }

    int binarySearch(int[] nums, int s, int e, int target) {
        int n = nums.length;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else
                e = mid - 1;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = pivotIndex(nums);

        if (pivot == -1) {
            return binarySearch(nums, 0, n - 1, target);
        }
        // else if(n == 0){
        //     return -1;
        // }
        else {
            // if(n == 1){
            //     return binarySearch(nums, 0, 0, target);
            // }

            // Array1 me binary search apply kr do 
            int s1 = 0;
            int e1 = pivot;
            if (target >= nums[s1] && target <= nums[e1]) {
                return binarySearch(nums, s1, e1, target);

            }

            // Array2 me binary search apply kr do
            int s2 = pivot + 1;
            int e2 = n - 1;
            if (target >= nums[s2] && target <= nums[e2]) {
                return binarySearch(nums, s2, e2, target);

            }
        }

        return -1;
    }
}