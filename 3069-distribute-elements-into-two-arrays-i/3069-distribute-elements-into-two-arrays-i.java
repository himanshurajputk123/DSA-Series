class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);

        for(int i = 2; i < nums.length; i++){
            int lastEle1 = list1.get(list1.size()-1);
            int lastEle2 = list2.get(list2.size()-1);
            if(lastEle1 > lastEle2){
                list1.add(nums[i]);
            }
            else list2.add(nums[i]);
        }
        int k = 0;
        while(!list1.isEmpty()){
            nums[k++] = list1.removeFirst();
        }
        while(!list2.isEmpty()){
            nums[k++] = list2.removeFirst();
        }
        return nums;
    }
}