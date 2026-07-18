class Solution {
    public String bruteForce(String s){
        // 1. split string word wise
        // 2. reverse the word
        // 3. join the reversed words
        // 4. return joined string
        return s;
    }
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;
        while(i < n){
            int j = i;
            // step 1. Move i until space is found
            while(i < n && s.charAt(i) != ' ') i++;
            // step 2. when i found a space put k = i - 1;
            // and use StringBuilder to reverse build the string;
            for(int k = i - 1; k >= j; k--){
                sb.append(s.charAt(k));
            }
            if(i < n){
            sb.append(" ");
            // when i is at space move it further
            i++;
            }
        }
        return sb.toString();
    }
}