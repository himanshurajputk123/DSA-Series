class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;
        for(int i = 0; i< n; i++){
            xor ^= nums[i];
        }
        // [1,2,1,3,2,5] xor = 3^5;
        // can we now separate 3 and 5
        int rightMostBit = xor & (-xor);
        int b1 = 0; int b2 = 0;
        for(int i = 0; i < n; i++){
            if((nums[i] & rightMostBit) != 0){
                b1 ^= nums[i];
            } else b2 ^= nums[i];
        }
        return new int[] {b1, b2};
    }
}