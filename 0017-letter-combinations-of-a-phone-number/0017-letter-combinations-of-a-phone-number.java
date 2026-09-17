class Solution {
    public static void helperFunc(String digits, String[] letters, int i, StringBuilder sb, List<String> ans){
        if(i == digits.length()){
            ans.add(sb.toString());
            return;
        }
        int num = digits.charAt(i) - '0';
        String letter = letters[num];

        for(int k = 0; k < letter.length(); k++){
            sb.append(letter.charAt(k));
            helperFunc(digits, letters, i+1, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] letters = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        helperFunc(digits, letters, 0, sb, ans);
        return ans;
    }
}