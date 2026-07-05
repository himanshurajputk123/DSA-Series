class Solution {
    public int majorityElement(int[] nums) {
        // this is better solution but not optimal
        // T.C = 0(n) and u're using a extra space with S.C = 0(n);
        /*
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        for(int i = 0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return -1;
        */

        // MOORE's VOTING ALGO
        // T.C = 0(n) and S.C = 0(1);

        int n = nums.length;
        int count = 0;
        int candidate = nums[0];

        for(int i=0; i<n; i++){
            if(count == 0){
                candidate = nums[i];
                count = 1;
            }
            else if(nums[i] == candidate){
                count++;
            }
            else count--;

        }

        int freq = 0;
        for(int num: nums){
            if(num == candidate){
                freq++;
            }
        }
        if(freq > nums.length/2){
            return candidate;
        }
        return -1;
    }
}