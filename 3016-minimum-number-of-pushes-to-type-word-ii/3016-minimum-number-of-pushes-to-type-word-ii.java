class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            char ch = word.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // Step 2. Jiski jada frequency hai use kum push alot krne hain means
        // sort map in descending order
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int totalCost = 0;
        for(int i = 0; i<list.size(); i++){
            int pushCost = (i/8) + 1;
            totalCost += pushCost*list.get(i).getValue();
        }

        return totalCost;
    }
}