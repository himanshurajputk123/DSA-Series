class Solution {
    public long bruteForce(int[] nums){
        int n = nums.length;
        long sum = 0;
        for(int i = 0; i < n; i++){
            int largest = nums[i];
            int smallest = nums[i];
            for(int j = i; j < n; j++){
                largest = Math.max(largest, nums[j]);
                smallest = Math.min(smallest, nums[j]);

                sum += (long) (largest - smallest);
            }
        }
        return sum;
    }

    public int[] nge(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]) st.pop();
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return ans;
    }

    public int[] pge(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i]) st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }

    public long sumSubarraysMax(int[] nums){
        int n = nums.length;
        long sum = 0;
        int[] nge = nge(nums);
        int[] pge = pge(nums);

        for(int i = 0; i < n; i++){
            long left = i - pge[i];
            long right = nge[i] - i;

            long contribution = (left * right * nums[i]);

            sum = (sum + contribution);
        }
        return sum;
    }

    public int[] pse(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && nums[st.peek()] > nums[i]) st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }

    public int[] nse(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]) st.pop();
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);            
        }
        return ans;
    }

    public long sumSubarraysMin(int[] nums){
        int n = nums.length;
        long sum = 0;
        int[] nse = nse(nums);
        int[] pse = pse(nums);

        for(int i = 0; i < n; i++){
            long left = i - pse[i];
            long right = nse[i] - i;

            long contribution = (left * right * nums[i]);

            sum = (sum + contribution);
        }
        return sum;
    }

    public long subArrayRanges(int[] nums) {
        //return bruteForce(nums);
        return sumSubarraysMax(nums) - sumSubarraysMin(nums);

    }
}