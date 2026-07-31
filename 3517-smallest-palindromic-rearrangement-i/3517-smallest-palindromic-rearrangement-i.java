class Solution {
    public String smallestPalindrome(String s) {
        
        // count freq
        int[] freq = new int[26];
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        char mid = '0';
        for(int i = 0; i<26; i++){
            if(freq[i] % 2 != 0){
                // this char is our the one which will go in middle
                mid = (char)('a' + i);
            }
            // add half
            int half = freq[i] / 2;
            while(half > 0){
                sb.append((char)('a' + i));
                half--;
            }
        }
        //StringBuilder rev = new StringBuilder(sb).reverse();

        int leftLength = sb.length();
        // there should be some condition around mid
        if(mid >= 'a' && mid <= 'z'){
            sb.append(mid);
        }
        // now just reverse copy and append to sb
        for (int i = leftLength - 1; i >= 0; i--) {
            sb.append(sb.charAt(i));
        }
        //sb.append(rev.toString());

        return sb.toString();
    }
}