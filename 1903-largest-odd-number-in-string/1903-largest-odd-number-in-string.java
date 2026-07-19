class Solution {
    // Brute Force ==> Generates all substrings 
    // and checks which one is largest odd number
    // T.C = O(n * n);
    public String largestOddNumber(String num) {
        // this is optimal solution
        // T.C = O(n) and S.C = O(1)
        int i = num.length() - 1;
        while(i >= 0){
            int digit = num.charAt(i) - '0';
            if(digit % 2 != 0){
                return num.substring(0, i + 1);
            } else {
                i--;
            }
        }
        return "";
    }
}