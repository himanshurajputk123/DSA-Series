class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        /* 
        this is better approach but not the optimal
        takes T.C = O(nlogn);

        Arrays.sort(nums);
        int currentLength = 1;
        int maxLength = 1;
        for(int i = 0; i<n-1; i++){
            // duplicates then ignore
            if(nums[i] == nums[i+1]){
                continue;
            }
            // consecutive numvers
            else if(nums[i] + 1 == nums[i+1]){
                currentLength++;
            } else{
                // gap [1,2,3,5,6,7] sudden 5 is a gap which broken thesequence 
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }

        }
        return maxLength = Math.max(maxLength, currentLength);
        */

        // Use of HashSet in order to optimise the solution
        // Will take T.C => O(n) but in some certains conditions
        // recall those conditions

        

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        
        int longest = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int current = num;
                int length = 1;
            while(set.contains(current + 1)){
                current++;
                length++;
            }

            longest = Math.max(longest, length);
            }
        }
        
        return longest;
        
    }
}