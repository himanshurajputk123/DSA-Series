class Solution {
    public int reverse(int x) {
        int sign = 1;
        int m = x;
        if(m < 0) {
            sign = -1;
            m = -m;
        }
        long rev = 0;
        while(m != 0){
            int rem = m % 10;
            rev = rem + rev*10;
            m /= 10;
        }
        long ans = sign*rev;
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return 0;
        return (int) ans;

    }
}