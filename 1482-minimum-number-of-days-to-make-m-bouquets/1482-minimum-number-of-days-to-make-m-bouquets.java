class Solution {
    // B.S. on Answer ki khasiyat baat yhi hai ki 
    // tmhe agr isPossible() function likhna aa gya toh smjho question ho gyaa

    static boolean isPossible(int[] bloomDay, int day, int m, int k){
        int n = bloomDay.length;
        int cnt = 0;
        int noOfBouqe = 0;
        for(int i = 0; i<n; i++){
            if(bloomDay[i] <= day){
                cnt++;
            } else {
                noOfBouqe += cnt / k;
                cnt = 0;
            }
        }
        noOfBouqe += cnt / k;

        return (noOfBouqe >= m);
    }
    
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }
        int s = mini;
        int e = maxi;
        int ans = -1;
        
        if(m * k > n) return -1; // when array chota pd gya

        while(s <= e){
            int mid = s + (e - s)/2;
            if(isPossible(bloomDay, mid, m, k)){
                ans = mid;
                e = mid - 1;
            } else s = mid + 1;
        }
        return ans;
        
    }
}