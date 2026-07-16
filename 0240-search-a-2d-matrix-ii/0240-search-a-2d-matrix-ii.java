class Solution {
    /* Brute Force: T.C = O(M x N)

        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        boolean isPresent = false;

        for(int i = 0; i<totalRow; i++){
            for(int j = 0; j<totalCol; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;

    */

    // T.C = O(M + N);
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length; // M
        int totalCol = matrix[0].length; // N

        int currentRow = 0;
        int currentCol = totalCol - 1;

        while( currentRow < totalRow && currentCol >= 0){
            if(matrix[currentRow][currentCol] == target){
                return true;
            }
            else if(matrix[currentRow][currentCol] > target){
                // ignore current col and move left
                currentCol--;
            } else currentRow++; // everything left of matrix[currentRow][currentCol] is sorted so move to Left;
        }
        return false;
    }
    
}