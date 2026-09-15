class Solution {
    public static void helperFunction(int[] nums, int idx, int target, List<List<Integer>> ans, List<Integer> list){
        
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = idx; i < nums.length; i++){
            if(i > idx && nums[i] == nums[i - 1]) continue;
            if(nums[i] > target) break;

            list.add(nums[i]);

            // call the function
            helperFunction(nums, i+1, target - nums[i], ans, list);
            list.removeLast();
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helperFunction(candidates, 0, target, ans, list);

        return ans;
    }
}