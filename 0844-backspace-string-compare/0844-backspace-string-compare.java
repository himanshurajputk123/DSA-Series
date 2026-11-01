class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sbs = new StringBuilder();
        StringBuilder sbt = new StringBuilder();
        
        Stack<Character> sts = new Stack<>();
        Stack<Character> stt = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!sts.isEmpty() && ch == '#') sts.pop();
            else if(ch != '#') sts.push(ch);
        }

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(!stt.isEmpty() && ch == '#') stt.pop();
            else if(ch != '#') stt.push(ch);
        }

        while(!sts.isEmpty()){
            sbs.append(sts.pop());
        }
        
        while(!stt.isEmpty()){
            sbt.append(stt.pop());
        }
        return sbt.toString().equals(sbs.toString());
    }
}