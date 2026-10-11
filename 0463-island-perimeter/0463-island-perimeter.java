class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int peri = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] != 0){
                    //check boundaries
                    // top
                    if(i-1 >= 0) peri += grid[i-1][j] == 0 ? 1 : 0;
                    // bottom
                    if(i+1 < n) peri += grid[i+1][j] == 0 ? 1 : 0;
                    // left
                    if(j-1 >= 0) peri += grid[i][j-1] == 0 ? 1 : 0;
                    // right
                    if(j+1 < m) peri += grid[i][j+1] == 0 ? 1 : 0;
                    // boundaries edges
                    if(i == 0) peri += 1;
                    if(i == n - 1) peri += 1;
                    if(j == 0) peri += 1;
                    if(j == m - 1) peri += 1;
                    
                }
            }
        }
        return peri;
    }
}