class Solution {
    public String removeKdigits(String num, int k) {
        if(k == num.length()) return "0";

        Stack<Character> st = new Stack<>();
        int cnt = 0;
        for(int i = 0; i < num.length(); i++){
            char ch = num.charAt(i);
            while(!st.isEmpty() && (st.peek() > ch && cnt != k)) {
                st.pop();
                cnt++;
            }
            st.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        int idx = 0;

        while(idx < sb.length() && sb.charAt(idx) == '0') idx++;
        String ans = sb.substring(idx);

        return ans.length() == 0 ? "0" : ans;
        
    }
}