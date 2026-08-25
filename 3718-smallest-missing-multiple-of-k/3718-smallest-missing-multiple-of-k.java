class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] % k == 0){
                set.add(nums[i]);
            }            
        }
        int max = 0;
        if(!set.isEmpty()){
            max = Collections.max(set);
        }
        for(int i = k; i <= max; i += k){
            if(!set.contains(i)) return i;
        }
        return max + k;

        
    }
}