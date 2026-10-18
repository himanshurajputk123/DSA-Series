class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0;
        int i = 1;

        while(i < n){            
            if(prices[i] > prices[i-1]){
                ans += prices[i] - prices[i-1];                
            }
            i++;
        }
        return ans;
    }
}