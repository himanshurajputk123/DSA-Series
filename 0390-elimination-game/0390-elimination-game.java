class Solution {
    public static int iterativeSol(int n){
        int a1 = 1;
        int cnt = n;
        int dis = 1;
        boolean leftToRight = true;
        while(cnt > 1){
            if(leftToRight || (cnt & 1) == 1) a1 += dis;
            cnt /= 2;
            dis *= 2;
            leftToRight = !leftToRight;
        }
        return a1;
    }
    public int helperFunc(int a1, int dis, int cnt, int i) {
        if (cnt == 1) {
            return a1;
        }

        // Update the first remaining element
        if (i == 1 || (cnt & 1) == 1) {
            a1 += dis;
        }

        return helperFunc(a1, dis*2, cnt/2, 1-i);
    }
    public int lastRemaining(int n) {
        return helperFunc(1, 1, n, 1);
        //return iterativeSol(n);
    }
}