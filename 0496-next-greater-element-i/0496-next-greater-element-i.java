class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];
        int idx = 0;        
        for(int i = 0; i < n; i++){
            // T.C = O(n * m * m)            
            int ele = nums1[i];
            for(int j = 0; j < m; j++){
                boolean putted = false;
                if(nums2[j] == ele){
                    for(int k = j+1; k < m; k++){
                        if(nums2[k] > ele){
                            ans[i] = nums2[k];
                            putted = true;
                            break;
                        }
                    }
                    if(!putted) {
                        ans[i] = -1;                        
                    }
                    break;
                }
            }
        }
        return ans;
    }
}