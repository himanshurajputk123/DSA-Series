class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 1; // doesn't have left neighbor
        right[n-1] = 1; // doesn't have right neighbor
        
        // left
        for(int i = 1; i < n; i++){
            if(ratings[i] > ratings[i-1]){
                left[i] = left[i-1]+1;
            }else left[i] = 1;
        }

        // right
        for(int i = n - 2; i>= 0; i--){
            if(ratings[i] > ratings[i+1]){
                right[i] = right[i+1]+1;
            }else right[i] = 1;
        }

        // take max of right and left
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += Math.max(left[i], right[i]);
        }
        return ans;
    }
}