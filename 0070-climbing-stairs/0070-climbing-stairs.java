class Solution {
    public int climbStairs(int n) {
        // base condition
        int ans = 0;
        int first = 1;
        int second = 1;
        if(n == 1){
            ans = 1;
        }
        else if(n == 2){
            ans = 2;
        }
        else{
            n = n - 1;
            while(n != 0){
                ans = first + second;
                first = second;
                second = ans;
                n--;
            }
        }
/*
            ans = first + second;
            first = second;
            second = ans;
*/

        return ans;
    }
}