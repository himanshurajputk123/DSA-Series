class Solution {

    static int solve(int[] piles, int hours){
        int n = piles.length;
        int totalHrs = 0;
        for(int i = 0; i<n; i++){
            totalHrs += Math.ceil((double)piles[i] / hours);
        }
        return totalHrs;
    }

    public int minEatingSpeed(int[] piles, int h) {
    /*    // bruteforce =>
        int max = piles[0];
        for (int num : piles) {
            if (num > max) {
                max = num;
            }
        }
        for(int i = 1; i<=max; i++){
            int reqTime = solve(piles, i);
            if(reqTime <= h){
                return i;
            }
        }
        return -1;
    */
    
    int max = piles[0];
        for (int num : piles) {
            if (num > max) {
                max = num;
            }
        }
    // Using Binary Search
        int s = 1;
        int e = max;
        int ans = Integer.MAX_VALUE;
        while(s <= e){
            int mid = s + (e - s)/2;
            int totalHrs = solve(piles, mid);

            if(totalHrs <= h){
                ans = mid;
                e = mid - 1;
            } else s = mid + 1;
        }
        return ans;

    }
}