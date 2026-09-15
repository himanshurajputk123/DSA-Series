class Solution {
    public static boolean isPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int n = s.length();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j <= n; j++){
                String sub = s.substring(i,j);
                if(isPalindrome(sub)){
                    cnt++;
                }
            }
        }
        // check isPalindromee not
        // maintain a count variable and return that variable in end
        return cnt;
    }
}