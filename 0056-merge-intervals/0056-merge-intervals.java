class Solution {

    public int[][] optimal(int[][] intervals) { 
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();

        int i = 0;
        while (i < n) {
            int s = intervals[i][0];
            int e = intervals[i][1];

            int j = i + 1;
            while (j < n && intervals[j][0] <= e) {
                e = Math.max(e, intervals[j][1]);
                j++;
            }
            res.add(new int[] { s, e });
            i = j;
        }

        return res.toArray(new int[res.size()][]);

    }

    public int[][] striversApproach(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        if (intervals == null || intervals.length == 0) {
            return res.toArray(new int[0][]);
        }

        // sorting according to its start
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int[] i : intervals) {
            if (i[0] <= end) {
                end = Math.max(end, i[1]);
            } else {
                res.add(new int[] { start, end });
                start = i[0];
                end = i[1];
            }
        }

        res.add(new int[] { start, end });

        return res.toArray(new int[0][]);
    }


    public int[][] merge(int[][] intervals) {
    // both solutions takes O(nlogn) TC and O(n) SC        
        //return optimal(intervals);
        return striversApproach(intervals);
    }
}