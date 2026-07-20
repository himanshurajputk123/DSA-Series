class Solution {
    public static String bruteForce(String[] strs) {
        String ans = "";
        String first = strs[0];

        for (int i = 1; i <= first.length(); i++) {
            String prefix = first.substring(0, i);
            // check every string
            boolean found = true;

            for (int k = 0; k < strs.length; k++) {
                if (!strs[k].startsWith(prefix)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                ans = prefix;
            }
        }
        return ans;
    }

    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String first = strs[0];

        for (int col = 0; col < first.length(); col++) {
            for (int row = 1; row < n; row++) {
                // we need not to generates all prefix
                // we just need to compare col wise, upto which col
                // values of col are same...return substring upto
                // which cols have the same prefix
                if(col == strs[row].length() || 
                first.charAt(col) != strs[row].charAt(col)) {
                    return first.substring(0, col);
                }
            }
        }
        return first;
        //return bruteForce(strs);
    }
}