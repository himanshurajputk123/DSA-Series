class Solution {
    public static int score(int[] nums, int left, int right){
        if(left == right) return nums[left];
        int leftPick = nums[left] - score(nums, left+1, right);
        int rightPick = nums[right] - score(nums, left, right-1);
        return Math.max(leftPick, rightPick);
    }

    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int ans = score(nums, 0, n - 1);
        if(ans >= 0) return true;
        else return false;
    }
}