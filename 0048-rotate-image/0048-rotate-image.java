class Solution {
    public static void transposeOfMatrix(int[][] mat){
        int n  = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp  = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void reverseRow(int[] nums, int s, int e){
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        transposeOfMatrix(matrix);
        for(int i = 0; i < n; i++){
            reverseRow(matrix[i], 0, n-1);
        }
    }
}