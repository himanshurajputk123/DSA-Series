class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalrow = matrix.length;
        int totalcol = matrix[0].length;

        int s = 0;
        int e = (totalrow * totalcol) - 1;

        while(s<=e){
            int mid = s + (e-s)/2;

            int rowIdx = mid / totalcol;
            int colIdx = mid % totalcol;

            if(matrix[rowIdx][colIdx] == target){
                return true;
            }
            else if(matrix[rowIdx][colIdx] > target){
                //left
                e = mid - 1;
            } // right
            else s = mid + 1;
        }
        return false;
    }
}