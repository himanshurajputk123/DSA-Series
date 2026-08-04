class Solution {
    // BruteForce => Use HashMap
    // BetterSolution => Use Bit Operators
    public static int betterSolution(int[] nums){
        // iterate over 0 to 32 bits and count setbits for each idx
        // if cnt is not a multiple of 3 means it is our ans; => build ans from it by setting bit at its correct position
        int n = nums.length;
        int ans = 0;
        for(int bitIdx = 0; bitIdx<32; bitIdx++){
            int cnt = 0;
            for(int i = 0; i<n; i++){
                if((nums[i] & (1 << bitIdx)) != 0){ // checking ith bit is set or not
                    cnt++;
                }
            }
            if(cnt % 3 == 1){
                ans = ans | (1 << bitIdx); // (n | (1<<i)) setting the ith bit
            }
        }
        return ans;
    }
    public static int optimalSolution(int[] nums){
        // why this is better as in for T.C to be O(n * 32) n = 2^32
        // hence log is very small here;
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 1; i < n; i=i+3){
            if(nums[i] != nums[i-1]){
                return nums[i-1];
            }
        } // agr return nhi hua abhi tk means last element hi humara ans hai;
        return nums[n - 1];
    }
    public static int mostOptimalSolution(int[] nums){
        // learn this solution and prepare yourself with followups of interviewer
        // this solution is kinda which we'll not get hit suddenly in interview so we've to remember it;
        int n = nums.length;
        int ones = 0;
        int twos = 0;
        for(int i = 0; i < n; i++){
            ones = (ones ^ nums[i] & ~twos);
            twos = (twos ^ nums[i] & ~ones);
        }
        return ones;
    }
    public int singleNumber(int[] nums) {
        //return betterSolution(nums); // T.C => O(n * 32);
        //return optimalSolution(nums); // T.C => O(nLogn + n/3);
        return mostOptimalSolution(nums); // T.C => O(n);
    }
}