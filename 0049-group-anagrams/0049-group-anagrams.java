class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String s = new String(charArr);

            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}