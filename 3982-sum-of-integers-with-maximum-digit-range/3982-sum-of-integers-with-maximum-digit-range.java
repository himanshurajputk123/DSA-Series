class Solution {
    public int maxDigitRange(int[] nums) {

        int maxRange = -1;
        int sum = 0;

        for (int num : nums) {

            int temp = num;
            int maxDigit = 0;
            int minDigit = 9;

            while (temp > 0) {
                int digit = temp % 10;
                maxDigit = Math.max(maxDigit, digit);
                minDigit = Math.min(minDigit, digit);
                temp /= 10;
            }

            int diff = maxDigit - minDigit;

            if (diff > maxRange) {
                maxRange = diff;
                sum = num; // new maximum found
            } else if (diff == maxRange) {
                sum += num; // another number with same range
            }
        }

        return sum;
    }
}