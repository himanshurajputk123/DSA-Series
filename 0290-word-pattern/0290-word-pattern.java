class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverse = new HashMap<>();

        for(int i = 0; i < words.length; i++){
            char ch = pattern.charAt(i);
            String str = words[i];
            
            if(map.containsKey(ch)) {
                if (!map.get(ch).equals(str)) return false;
            }else {
                if (reverse.containsKey(str)) return false;
                map.put(ch, str);
                reverse.put(str, ch);
            }
        }
        return true;
    }
}