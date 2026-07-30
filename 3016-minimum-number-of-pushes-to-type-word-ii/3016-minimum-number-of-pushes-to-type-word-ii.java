class Solution {
    public static int isOptimal(String word){
    //  use a fixed size array instead of HashMap
        int n = word.length();
        int[] freq = new int[26];
        for(int i = 0; i<n; i++){
            char ch = word.charAt(i);
            freq[ch - 'a']++;
        }

        // sort freq array in descending order
        // traverse in reverse
        Arrays.sort(freq);
        int totalCost = 0;

        for (int i = 25, idx = 0; i >= 0; i--, idx++) {
            int pushCost = (idx / 8) + 1;
            totalCost += pushCost * freq[i];
        }

        return totalCost;    
    }

    public int minimumPushes(String word) {
        // int n = word.length();
        // HashMap<Character, Integer> map = new HashMap<>();
        
        // for(int i = 0; i<n; i++){
        //     char ch = word.charAt(i);
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }
        // // Step 2. Jiski jada frequency hai use kum push alot krne hain means
        // // sort map in descending order
        // List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        // list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // for (int i = 25, idx = 0; i >= 0; i--, idx++) {
        //     totalCost += pushCost*list.get(i).getValue();
            
        // }

        // return totalCost;
        return isOptimal(word);
    }
}