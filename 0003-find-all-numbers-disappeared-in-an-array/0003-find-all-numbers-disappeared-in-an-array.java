class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i =0; i<n; i++){
            int value = Math.abs(nums[i]);
            int position = value - 1;

            if(nums[position]>0){
                nums[position] = -nums[position];
            }
        }
        for(int i =0; i<n; i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;
    }
}