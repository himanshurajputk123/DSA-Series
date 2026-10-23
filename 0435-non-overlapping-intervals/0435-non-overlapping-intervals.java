class Solution {
    class Intervals{
        int st, end;
        Intervals(int st, int end){
            this.st = st;
            this.end = end;
        }
    }
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Intervals[] inter = new Intervals[n];
        for(int i = 0; i < n; i++){
            inter[i] = new Intervals(intervals[i][0], intervals[i][1]);
        }
        Arrays.sort(inter, (a,b) -> Integer.compare(a.end, b.end));
        int cnt = 1;
        int nonOverlap = inter[0].end;
        for(int i = 1; i < n; i++){
            if(inter[i].st >= nonOverlap){
                cnt++;
                nonOverlap = inter[i].end;
            }
        }
        return n - cnt;
    }
}