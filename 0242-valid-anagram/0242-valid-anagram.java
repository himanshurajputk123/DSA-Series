class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        if(str1.length != str2.length){
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i = 0; i<str1.length; i++){
            if(str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }
}