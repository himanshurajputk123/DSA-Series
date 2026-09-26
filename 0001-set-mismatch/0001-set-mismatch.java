class Solution {
    public int[] bruteForce(int[] nums){
        // we're using an extra space here
        int n = nums.length;
        int[] freq = new int[n];
        int missingEle = -1;
        int duplicateEle = -1;
        Arrays.fill(freq, 0);
        for(int i = 0; i<n; i++){
            freq[nums[i] - 1] += 1;
        }
        for(int i = 0; i<n; i++){
            if(freq[i] == 0) missingEle = i+1;
            if(freq[i] == 2) duplicateEle = i+1;
        }
        return new int[]{duplicateEle, missingEle};
    }
    // public int[] optimalSol(int[] nums){

    // }
    public int[] findErrorNums(int[] nums) {
        return bruteForce(nums);
    }
}