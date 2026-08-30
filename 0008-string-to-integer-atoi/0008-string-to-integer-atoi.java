class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        while(i < n && s.charAt(i) == ' ') i++;
        int sign = 1;

        if(i < n && s.charAt(i) == '-') {            
            sign = -1;
            i++;
        }else if(i < n && s.charAt(i) == '+') {
            i++;
        }
        long num = 0;        

        while(i < n && Character.isDigit(s.charAt(i))){
            char ch = s.charAt(i);
            int digit = ch - '0';
                        
            if(num > Integer.MAX_VALUE / 10 
            || (num == Integer.MAX_VALUE / 10 && digit > 7)){

                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;            
        }
        return (int)(sign * num);
    }
}