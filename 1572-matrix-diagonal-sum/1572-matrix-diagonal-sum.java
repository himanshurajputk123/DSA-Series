class Solution {
    public static int brute(int[][] mat){
        int n = mat.length; // n x n ki matrix hi hai
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) sum += mat[i][j];
                else if(i+j == n - 1) sum += mat[i][j];
            }
        }
        return sum;
    }
    public int diagonalSum(int[][] mat) {
        return brute(mat);
    }
}