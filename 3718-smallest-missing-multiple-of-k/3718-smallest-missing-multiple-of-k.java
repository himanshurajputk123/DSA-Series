class Solution {
    public static int betterSolution(int[] nums, int k){
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int num : nums){
            set.add(num);
        }
        for(int i = k; ; i += k){
            if(!set.contains(i))
                return i;
        }
    }
    public int missingMultiple(int[] nums, int k) {
        // HashSet<Integer> set = new HashSet<>();
        // int n = nums.length;
        // for(int i = 0; i < n; i++){
        //     if(nums[i] % k == 0){
        //         set.add(nums[i]);
        //     }            
        // }
        // int max = 0;
        // if(!set.isEmpty()){
        //     max = Collections.max(set);
        // }
        // for(int i = k; i <= max; i += k){
        //     if(!set.contains(i)) return i;
        // }
        // return max + k;

        return betterSolution(nums, k);

        
    }
}