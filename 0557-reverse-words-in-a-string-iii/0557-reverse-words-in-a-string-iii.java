class Solution {
    // T.C => O(n) S.C => O(n);
    // but this brute 'coz we're doing split causing 
    // temporary memory objects creation and then adding back
    public String bruteForce(String s){
        // 1. split string word wise
        String [] ans = s.split(" ");
        
        // 2. reverse the word
        for(int i = 0; i<ans.length; i++){
            StringBuilder sb = new StringBuilder(ans[i]);
            ans[i] = sb.reverse().toString();
        // 3. join the reversed words   
        }
        // 4. return joined string
        return String.join(" ", ans);
    }

    // T.C => O(n) S.C => O(n);
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
        
    //    return bruteForce(s);
    }
}