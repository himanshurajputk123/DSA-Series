class Solution {
    public static double recursiveSol(double x, int n){
        if(n == 0) return 1;
        long pow = n;
        if(n < 0){
            pow = -pow;
        }
 
        double half = recursiveSol(x, (int)(pow/2));
        double result;

        if(pow % 2 == 0){
            result = half * half;
        }else result =  x * half * half;

        return n < 0 ? 1 / result : result;

    }
    public static double iterativeSol(double x, int n){
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
    public double myPow(double x, int n) {        
        return recursiveSol(x, n);

    }
}