class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // this is better solution not the optimal one
        // and this is giving TLE
        // T.C => O(n*n)
        //    HashSet<List<Integer>> ans = new HashSet<>();
        //     for (int i = 0; i < nums.length; i++) {
        //         HashSet<Integer> seen = new HashSet<>();
        //         for (int j = i + 1; j < nums.length; j++) {
        //             int thirdNum = -(nums[i] + nums[j]);
        //             if (seen.contains(thirdNum)) {
        //                 List<Integer> temp = Arrays.asList(nums[i],  nums[j], thirdNum);
        //                 Collections.sort(temp);
        //                 ans.add(temp);
        //             }
        //             // add current number to seen;
        //             seen.add(nums[j]);
        //         }
        //     }
        //     return new ArrayList<>(ans);

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1; 
            int k = nums.length - 1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum<0){
                    j++;

                }else if(sum >0){
                    k--;

                } else {
                    // found a triplet, make triple in temp and store in ans;
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    // edge cases
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
}