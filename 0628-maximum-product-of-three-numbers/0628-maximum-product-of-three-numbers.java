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
        //return sortingSolution(nums);
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int num : nums){
            if(num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if(num > max2){
                max3 = max2;
                max2 = num;
            } else if(num > max3){
                max3 = num;
            }

            if(num < min1){
                min2 = min1;
                min1 = num;
            } else if(num < min2){
                min2 = num;
            }
        }
        int product1 = min1*min2*max1;
        int product2 = max1*max2*max3;
        return Math.max(product1, product2);
    }
}