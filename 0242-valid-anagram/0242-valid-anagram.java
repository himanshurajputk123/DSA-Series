class Solution {
    public boolean isBruteForce(String s, String t){
        // T.C => O(2n) + O(2nlogn) + O(n) ==> O(nlogn)
        char[] str1 = s.toCharArray(); // toCharArray() takes T.C => O(n)
        char[] str2 = t.toCharArray();
        if(str1.length != str2.length){
            return false;
        }
        Arrays.sort(str1); // sorting T.C => O(nlogn)
        Arrays.sort(str2);
        for(int i = 0; i<str1.length; i++){ // loop T.C => O(n)
            if(str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean isAnagram(String s, String t) {
        return isBruteForce(s, t);
    }
}