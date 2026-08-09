class Solution {
    public static int sortingSolution(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        int min1 = nums[0];
        int min2 = nums[1];
        int max1 = nums[n-3];
        int max2 = nums[n-2];
        int max3 = nums[n-1];

        int product1 = min1 * min2 * max3;
        int product2 = max1 * max2 * max3;
        return Math.max(product1, product2);
    }
    public int maximumProduct(int[] nums) {
        return sortingSolution(nums);
    }
}