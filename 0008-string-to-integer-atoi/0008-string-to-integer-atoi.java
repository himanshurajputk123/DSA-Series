class Solution {
    public int myAtoi(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        int sign = 1;

        if (i < s.length()) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                i++;
            }
        }
        // lastlly handle the overflow of int

        long num = 0;
        //num = num * 10 + digit;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0'; // converting char to int 
            // ascii of '1' == 49 and ascii of '0' == 48 ==> {49 - 48 = 1};

            if (num > Integer.MAX_VALUE / 10 ||
                    (num == Integer.MAX_VALUE / 10 &&
                            digit > (sign == 1 ? 7 : 8))) {

                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;

        }
        return (int)(sign * num);
    }
}