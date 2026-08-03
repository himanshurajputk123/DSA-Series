class Solution {
    public int minBitFlips(int start, int goal) {
        int flip = start ^ goal;
        int ans = 0;
        while(flip != 0){
            flip = flip & (flip - 1);
            ans++;
        }
        return ans;
    }
}