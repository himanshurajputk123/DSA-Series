class Solution {
    public int[] plusOne(int[] digits) {
    int n = digits.length;
    
    for (int i = n - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits;  // no carry needed
        }
        digits[i] = 0;  // set current digit to 0 and continue loop
    }
    
    // If we reach here, all digits were 9
    int[] arr = new int[n + 1];
    arr[0] = 1;  // leading 1, rest are 0 by default
    return arr;
}

}