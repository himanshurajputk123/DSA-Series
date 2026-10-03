class Solution {
    public int solve(int n){
        if(n == 0 || n == 1) return 1;
        return n * solve(n - 1);
    }
    public int uniquePaths(int m, int n) {
        int right = n-1;
        int left = m-1;
        int total = m + n - 2;
        
        double upper = 1;
        for(int i = m; i<=m+n-2; i++){
            upper *= i;
        }
        double lower = 1;
        for(int i = 1; i<=n-1; i++){
            lower *= i;
        }

        //unique ways = (m+n-2)!/((m-1)!*(n-1)!)
        //int ans = solve(total)/(solve(left)*solve(right));
        double ans = upper/lower;

        return (int)ans;
    }
}