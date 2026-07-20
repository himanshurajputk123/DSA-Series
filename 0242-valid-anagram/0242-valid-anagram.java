class Solution {
    public boolean isBruteForce(String s, String t) {
        // T.C => O(2n) + O(2nlogn) + O(n) ==> O(nlogn)
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray(); // toCharArray() takes T.C => O(n)
        char[] str2 = t.toCharArray();
        Arrays.sort(str1); // sorting T.C => O(nlogn)
        Arrays.sort(str2);
        for (int i = 0; i < str1.length; i++) { // loop T.C => O(n)
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isOptimal(String s, String t) {
        // this takes T.C = O(n) && S.C = O(1);
        // but valid for lower-case chars only
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isAnagram(String s, String t) {
        //return isBruteForce(s, t);
        //return isOptimal(s, t);

        // now think of Optimal solution
        // do wee really need sorting>? NO, we only need the number of times a character is appearing that's it. Which leads to Use of HashMap;

        // T.C => O(n)
        // S.C => O(k) or O(1) if only lowercase characters that's only 26(fixed)
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            // Increase count for character from s
            char ch1 = s.charAt(i);
            map.put(ch1, map.getOrDefault(ch1, 0) + 1);

            // Decrease count for character from t
            char ch2 = t.charAt(i);
            map.put(ch2, map.getOrDefault(ch2, 0) - 1);
        }

        // Every count should become 0
        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}