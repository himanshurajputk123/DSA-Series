class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = m - 1;

        while(startRow <= endRow && startCol <= endCol){
            for(int i = startCol; i <= endCol; i++){
                list.add(matrix[startRow][i]);                
            }
            startRow++;

            for(int i = startRow; i <= endRow; i++){
                list.add(matrix[i][endCol]);
            }
            endCol--;

            if(startRow <= endRow){
                for(int i = endCol; i >= startCol; i--){
                    list.add(matrix[endRow][i]);
                }
            endRow--;
            }
            
            if(startCol <= endCol){
                for(int i = endRow; i >= startRow; i--){
                    list.add(matrix[i][startCol]);                
            }
            startCol++;
            }
            
        }

        return list;
    }
}