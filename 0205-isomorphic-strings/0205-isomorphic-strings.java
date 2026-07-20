class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        if(s.length() == t.length()){
            for(int i = 0; i<s.length(); i++){
                if(!mapST.containsKey(s.charAt(i))){
                    if(mapTS.containsKey(t.charAt(i))){
                        return false;
                    }
                    mapST.put(s.charAt(i), t.charAt(i));
                    mapTS.put(t.charAt(i), s.charAt(i)); 
                } else{
                    // check whether this key is storing same or different one?
                    if(mapST.get(s.charAt(i)) != t.charAt(i) 
                    || mapTS.get(t.charAt(i)) != s.charAt(i)){
                        return false;
                    }
                }
            }
        } 
        return true;
    }
}