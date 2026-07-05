class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //1. Brute force => 4 for loops in order to find all quadraplets
        //2. Better sol. => 3 for loops and 4thNum = target - (n[i] + n[j] + n[k]);
        int n = nums.length;
        /*
        HashSet<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                HashSet<Integer> seen = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    int fourthNum = target - (nums[i] + nums[j] + nums[k]);
                    if (seen.contains(fourthNum)) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], fourthNum);
                        Collections.sort(temp);
                        ans.add(temp);

                    }
                    seen.add(nums[k]);
                }
            }
        }
        return new ArrayList<>(ans);
        */
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<n; i++){  
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j<n; j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;

                int k = j+1;
                int l = n-1;

                while(k<l){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum<target){
                        k++;
                    }else if(sum>target){
                        l--;
                    }else {
                        // found a quadraplet
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        // store temp in ans;
                        ans.add(temp);
                        k++;
                        l--;

                        while(k<l && nums[k] == nums[k-1]){
                            k++;
                        }
                        while(k<l && nums[l] == nums[l+1]){
                            l--;
                        }
                    }
                }
            }
        }
        return ans;
    }
}