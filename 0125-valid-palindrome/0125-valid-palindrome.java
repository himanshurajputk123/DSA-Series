class Solution {
    public boolean isPalindrome(String s) {

        //s = s.replaceAll("\\s+", ""); // \s matches any whitespace

        // Optimal Approach T.C = O(n) S.C = O(1)
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
            
        }
        return true;
        
/* //   BruteForce O(n) both S.C and T.C

        StringBuilder sb = new StringBuilder();

        for (char i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
*/
    }
}