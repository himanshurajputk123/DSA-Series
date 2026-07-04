class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] ans = new int[2];
        // for(int i = 0; i<nums.length; i++){
        //     for(int j = i+1; j<nums.length; j++){
        //         if(nums[i]+nums[j] == target){
        //             ans[0] = i;
        //             ans[1] = j;
        //         }
                
        //     }
        // }
    // Optimal:=>
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i<nums.length; i++){
            int x = target - nums[i];

            if(map.containsKey(x)){
                return new int[]{map.get(x), i};
            } else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}