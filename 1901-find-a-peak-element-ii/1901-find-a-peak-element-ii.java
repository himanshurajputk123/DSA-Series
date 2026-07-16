class Solution {
    static int maximumIdx(int[][] mat, int n, int m, int col){
        int maxi = -1;
        int idx = -1;
        for(int i = 0; i<n; i++){
            if(mat[i][col] > maxi){
                maxi = mat[i][col];
                idx = i;
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int s = 0; 
        int e = m - 1;
        while(s <= e){
            int mid = s + (e - s)/2;
            int maxRowIdx = maximumIdx(mat, n, m, mid);
            int left = mid - 1 >= 0 ? mat[maxRowIdx][mid - 1] : -1;
            int right = mid + 1 < m ? mat[maxRowIdx][mid + 1] : -1;

            if(mat[maxRowIdx][mid] > left && mat[maxRowIdx][mid] > right){
                return new int[] {maxRowIdx, mid};
            } else if(mat[maxRowIdx][mid] < left){
                e = mid - 1;
            } else s = mid + 1;
        }
        return new int[] {-1, -1};
    }
}