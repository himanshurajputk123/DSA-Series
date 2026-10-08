class Solution {
    public char isOptimal(String s, String t){
        char xor = 0;
        for(char ch : s.toCharArray()){
            xor ^= ch;
        }
        for(char ch : t.toCharArray()){
            xor ^= ch;
        }
        return xor;
    }
    public static char isBoolean(String s, String t){
        int[] freq = new int[26];

        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0) return (char)(i + 'a');
        }
        return '0';
    }
    public char findTheDifference(String s, String t) {
        return isOptimal(s, t);

    }
}