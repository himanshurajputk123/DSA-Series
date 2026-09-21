class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        
        int sqr = n*n;

        int startRow = 0;
        int startCol = 0;
        int endCol = n - 1;
        int endRow = n - 1;

        int k = 1;

        while(k <= sqr){
            while(startRow <= endRow && startRow <= endCol){
                for(int i = startCol; i <= endCol; i++){
                    mat[startRow][i] = k;
                    k++;
                }
                startRow++;

                for(int i = startRow; i <= endRow; i++){
                    mat[i][endCol] = k;
                    k++;
                }
                endCol--;

                if(startRow <= endRow){
                    for(int i = endCol; i >= startCol; i--){
                        mat[endRow][i] = k;
                        k++;
                    }
                    endRow--;
                }

                if(startCol <= endCol){
                    for(int i = endRow; i >= startRow; i--){
                        mat[i][startCol] = k;
                        k++;
                    }
                    startCol++;
                }
            }
        }
        return mat;
        
    }
}