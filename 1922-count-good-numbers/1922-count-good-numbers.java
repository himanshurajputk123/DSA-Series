class Solution {
    public static long power(long x, long n){
        long mod = 1000000007;
        if(n == 0) return 1;
 
        long half = power(x, n/2);
        long result = (half * half) % mod ;
        if(n % 2 == 1) result = (result * x) % mod;

        return result;

    }
    public int countGoodNumbers(long n) {
        long mod = 1000000007;
        
        long even = (n + 1) / 2;
        long odd = n / 2;

        long result1 = power(5, even);
        long result2 = power(4, odd);

        long result = (result1 * result2) % mod;

        return (int)result;
    }
}