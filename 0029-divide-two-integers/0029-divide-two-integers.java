class Solution {
    public static int isBruteForce(int dividend, int divisor){
        if(dividend == divisor) return 1;
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        long sum = 0;
        int cnt = 0;
        while(sum + dvs <= dvd){
            cnt++;
            sum += dvs;
        }
        return (sign == 1) ? (int)sum : (int)(-sum);
    }
    public static int isOptimal(int dividend, int divisor){
        if(dividend == divisor) return 1;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1: 1;
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        long ans = 0;
        while(dvd >= dvs){
            int cnt = 0;
            while(dvd >= (dvs << (cnt + 1))){
                cnt++;
            }
            ans += (1L << cnt);
            dvd -= (dvs << cnt);            

            // if(ans >= Integer.MAX_VALUE + 1 && sign == 1) return Integer.MAX_VALUE;
            // else if(ans >= Integer.MAX_VALUE + 1 && sign == -1) return Integer.MIN_VALUE;
        }
        return (sign == 1) ? (int)ans : (int)(-ans);
    }
    public int divide(int dividend, int divisor) {
        //return isBruteForce(dividend, divisor);
        return isOptimal(dividend, divisor);

    }
}