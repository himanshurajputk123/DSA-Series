class Solution {
    public static void helperFunc(List<String> list,
                StringBuilder sb, int n, int open, int closed){
        if(open == n && closed == n){
            list.add(sb.toString());
            return;
        }
        if(open < n){
            sb.append('(');
            helperFunc(list, sb, n, open+1, closed);
            sb.deleteCharAt(sb.length() - 1);
        }
        
        if(closed < open){
            sb.append(')');
            helperFunc(list, sb, n, open, closed+1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        
        helperFunc(ans, sb, n, 0, 0);
        return ans;
    }
}