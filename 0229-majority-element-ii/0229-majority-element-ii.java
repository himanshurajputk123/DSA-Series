class Solution {
    public List<Integer> majorityElement(int[] nums) {
/*
        // Better solution
        List<Integer> ans = new ArrayList<>();
        int min = nums.length/3 +1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) == min){
                ans.add(nums[i]);
            }
        }
        Collections.sort(ans);
        return ans;
*/
        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(count1 == 0 && el2 != nums[i]){
                count1 = 1;
                el1 = nums[i];
            }else if( count2 == 0 && el1 != nums[i]){
                count2 = 1;
                el2 = nums[i];
            }else if(nums[i] == el1) count1++;
            else if(nums[i] == el2) count2++;
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        count1 = 0; count2 = 0;
        for(int i = 0; i<n; i++){
            if(el1 == nums[i]) count1++;
            if(el2 == nums[i]) count2++;
        }
        int min = n/3 + 1;
        if(count1 >= min) ans.add(el1);
        if(count2 >= min) ans.add(el2);
        Collections.sort(ans);
        return ans;
    }
}