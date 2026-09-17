class Solution {
    public static boolean isPalindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    public static void helper(String s, int idx, List<String> list, List<List<String>> ans){
        if(idx == s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = idx; i < s.length(); i++){
            if(isPalindrome(s, idx, i)){
                list.add(s.substring(idx, i+1));
                helper(s, i+1, list, ans);
                list.removeLast();
            }
        }
    }
    public List<List<String>> partition(String s) {
        int n = s.length();
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        
        helper(s, 0, list, ans);

        return ans;
    }
}