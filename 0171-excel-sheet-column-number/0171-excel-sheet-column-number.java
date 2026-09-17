class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int i = 0;
        int ans = 0;
        while(i < n){
            int temp = (int)columnTitle.charAt(i) - 64;
            ans = 26*ans+temp;
            i++;
        }
        return ans;
    }
}