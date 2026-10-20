class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> Integer.compare(b.getValue(), a.getValue()));

        int i = 0;
        while (i < k){
            for(Map.Entry<Integer, Integer> entry : list){
                ans[i++] = entry.getKey();
                if(i == k) break;
            }

        }

        return ans;
    }
}