class Solution {
    public int minBitFlips(int start, int goal) {
        // the number of setBits in xor be our answer
        /*
        Start = 10; Goal = 7
        01010 ^ 00111 => 01101 Here The number of setBits is our answer
        */
        int xor = start ^ goal;
        int ans = 0;
        while(xor != 0){
            xor = xor & (xor - 1);
            ans++;
        }
        return ans;
    }
}