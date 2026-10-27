class Solution {
    public int[] bruetForce(int[] nums1, int[] nums2){
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
    public int[] nextLargerElement(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        int i = n - 1;
        st.push(arr[i]);
        ans[i] = -1;
        i--;
        while(i >= 0){
            if(arr[i] < st.peek()){
                ans[i] = st.peek();
                st.push(arr[i]);
                i--;
            }else{
                while(!st.isEmpty() && arr[i] >= st.peek()){
                    st.pop();
                }
                if(!st.isEmpty()){
                    ans[i] = st.peek();
                    st.push(arr[i]);
                    i--;
                }else{
                    ans[i] = -1;
                    st.push(arr[i]);
                    i--;
                }
            
            }
        }
        return ans;
    
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //return bruetForce(nums1, nums2);
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];
        int[] result = nextLargerElement(nums2);
        for(int i = 0; i < n; i++){
            int ele = nums1[i];
            for(int j = 0; j < m; j++){
                if(ele == nums2[j]){
                    ans[i] = result[j];
                    break;
                }
            }
        }
        return ans;
    }
}