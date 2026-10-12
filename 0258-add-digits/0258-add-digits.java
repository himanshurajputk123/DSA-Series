class Solution {
    public int digits(int n){
        int sumDigits = 0;
        while(n>0){
            sumDigits += n%10;
            n /= 10;
        }
        return sumDigits;
    }
    public int addDigits(int num) {
        int ans = num;
        while(num > 9){
            ans = digits(num);
            num = ans;
        }
        return ans;
        
    }
}