class Solution {
    public static void helperFunc(int[] nums, int i, List<List<Integer>> ans, List<Integer> list){
        if(i == nums.length){
            List<Integer> temp = new ArrayList<>(list);
            Collections.sort(temp);
            if(!ans.contains(temp)){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        // pick
        list.add(nums[i]);
        helperFunc(nums, i+1, ans, list);

        // not pick
        list.remove(list.size()-1);
        helperFunc(nums, i+1, ans, list);
    }

    public static void backtracker(int[] nums, int idx, List<List<Integer>> ans, List<Integer> list){
        ans.add(new ArrayList<>(list));
        
        for(int i = idx; i<nums.length; i++){
            if(i != idx && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            backtracker(nums, i+1, ans, list);
            list.removeLast();
        }
        
    }
    

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helperFunc(nums, 0, ans, new ArrayList<>());
        //Arrays.sort(nums);
        //backtracker(nums, 0, ans, new ArrayList<>());

        return ans;
    }
}