class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) { // O(n*(n+1)/2) ==> O(n*n);
                freq[s.charAt(j) - 'a']++;
                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;
                for (int f : freq) { // arr[26] O(26)
                    if (f > 0) {
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }
                ans += maxFreq - minFreq;
            }
        }
        // O(n*n*26) ==> O(n*n) 
        return ans;
    }
}