class Solution {
    public int findMinArrowShots(int[][] points) {
        int m = points.length;

        // important thing is this comparator
        // 
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));

        int cnt = 1;

        // this is also impt to know
        int arrowPosition = points[0][1];
        for(int i = 0; i < m; i++){
            
            // we're checking only 1st element of each row
            if(points[i][0] > arrowPosition){
                cnt++;
                arrowPosition = points[i][1];                
            }
        }
        
        return cnt;
    }
}