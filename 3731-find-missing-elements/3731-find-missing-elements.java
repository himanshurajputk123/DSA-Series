class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;                
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>(); //S.C => O(n);
        for (int num : nums) { // O(n)
            min = Math.min(min, num);
            max = Math.max(max, num);
            set.add(num);            
            }
        for(int i = min; i <= max; i++){ //O(max - min + 1)
            if(!set.contains(i)){ //O(1)
                    ans.add(i);
                }
        }
        return ans;
    }
    /* Overall time complexity O(n + R) where R = max - min + 1
    and space complexity be O(n + k) where k = number of missing number (list k liye)
    */
}