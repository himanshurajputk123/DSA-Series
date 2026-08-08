class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return (double) (1);
        if(n == 1) return x;
        if(x == 0) return (double) (0);
        if(x == 1) return (double) (1);
        double ans = 1.0;
        long power = n;
        if(power < 0) power = -power;
        while(power > 0){
            if(power % 2 == 1){
                ans *= x;
                power = power - 1;
            } else {
                power = power / 2;
                x *= x;
            }
        }
        if(n < 0) ans = 1.0/ans;
        return ans;

    }
}