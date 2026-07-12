class Solution {
    static int[] lowerAndupperBound(int[] nums, int target){
            int s = 0; 
            int e = nums.length-1;
            int lb = nums.length;
            int[] arr = new int[2];

            while(s<=e){
                int mid = s + (e-s)/2;

                if(nums[mid]>= target){
                    lb = mid;
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
            if(lb == nums.length || nums[lb] != target){
                return new int[]{-1, -1};
            }
            else arr[0] = lb;


            s = 0;
            e = nums.length - 1;
            int ub = nums.length;

            while(s<=e){
                int mid = s + (e-s)/2;

                if(nums[mid]<=target){
                    s = mid + 1;
                }
                else {
                    ub = mid;
                    e = mid -1;
                }
                
            } 
            arr[1] = ub-1;

            return arr;
        }


        // Method 2
        static int firstOccurrence(int[] nums, int target){
            int n = nums.length;
            int s = 0; int e = n - 1;
            int first = -1;
            while(s <= e){
                int mid = s + (e - s)/2;
                if(nums[mid] == target){
                    first = mid;
                    e = mid - 1;
                } 
                else if(nums[mid] < target) s = mid + 1;
                else e = mid - 1;
            }
            return first;
        }
        static int lastOccurrence(int[] nums, int target){
            int n = nums.length;
            int s = 0; int e = n - 1;
            int last = -1;
            while(s <= e){
                int mid = s + (e - s)/2;
                if(nums[mid] == target){
                    last = mid;
                    s = mid + 1;
                } 
                else if(nums[mid] < target) s = mid + 1;
                else e = mid - 1;
            }
            return last;
        }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        
        //ans = lowerAndupperBound(nums, target);
        int first = firstOccurrence(nums, target);
        if(first == -1) return new int[]{-1, -1};
        int last = lastOccurrence(nums, target);

        ans[0] = first;
        ans[1] = last;
        
        return ans;
    }
}