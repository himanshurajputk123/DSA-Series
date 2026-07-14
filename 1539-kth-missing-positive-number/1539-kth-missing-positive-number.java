class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;

        // BruteForce
            // O(n);
        // for(int i = 0; i<n; i++){
        //     if(arr[i] <= k) k++;
        //     else break;
        // }
        // return k;

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // Missing numbers before arr[mid]
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return s + k;
    }
}