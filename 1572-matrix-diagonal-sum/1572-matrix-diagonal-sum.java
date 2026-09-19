class Solution {
    public static int brute(int[][] mat){
        int n = mat.length; // n x n ki matrix hi hai
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) sum += mat[i][j];
                else if(i+j == n - 1) sum += mat[i][j]; // duplicate avoided
            }
        }
        return sum;
    }
    public static int optimal(int[][] mat){
        int sum = 0;
        int n = mat.length;

        for(int i = 0; i < n; i++){
            sum += mat[i][i];
            sum += mat[i][n-i-1];
        }
        if(n % 2 != 0){
            sum -= mat[n/2][n/2];
        }
        return sum;

    }
    public int diagonalSum(int[][] mat) {
        //return brute(mat);
        return optimal(mat);
    }
}