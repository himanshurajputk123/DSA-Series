class Solution {
    public String longestCommonPrefix(String[] strs) {
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
            if(found){
                ans = prefix;
            }
        }
        return ans;
    }
}