class Solution {
    public static void helperFunction(int[] nums, int i, int target, List<List<Integer>> ans, List<Integer> list){
        if(i == nums.length){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        if(nums[i] <= target){
            list.add(nums[i]);
            helperFunction(nums, i, target-nums[i], ans, list);
            list.removeLast();
        }
        helperFunction(nums, i+1, target, ans, list);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helperFunction(candidates, 0, target, ans, list);

        return ans;
    }
}