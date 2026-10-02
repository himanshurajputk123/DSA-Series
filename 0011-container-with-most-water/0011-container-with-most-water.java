class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int area = Integer.MIN_VALUE;
        while(l <= r){
            int width = r - l;
            int high = Math.min(height[l], height[r]);
            area = Math.max(area, width*high);
            if(height[l] < height[r])l++;
            else r--;
        }
        return area;
    }
}