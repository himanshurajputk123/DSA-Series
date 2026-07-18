class Solution {
    // T.C = O(n) S.C = O(n)
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
           c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    } 
    public String reverseVowels(String s) {
        // in java Strings are immutable
        char[] ans = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right){
            // Move left pointer until a vowel is found
            while (left < right && !isVowel(ans[left])) {
            left++;
            }
            // Move right pointer until a vowel is found
            while (left < right && !isVowel(ans[right])) {
            right--;
            }
                // found vowel? do the Swap
                char temp = ans[left];
                ans[left] = ans[right];
                ans[right] = temp;
            
            left++;
            right--;
        }
        return new String(ans);
    }
}