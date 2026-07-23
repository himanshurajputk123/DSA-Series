class Solution {
    public static String isOptimalSol(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        // count freq
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // list initialization
        List<Map.Entry<Character, Integer>> list = 
            new ArrayList<>(map.entrySet());
        // sort the list (descending order)
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        StringBuilder ans = new StringBuilder();

        // append to ans
        for(Map.Entry<Character, Integer> entry : list){
            char ch = entry.getKey();
            int count = entry.getValue();

            while(count > 0){
                ans.append(ch);
                count--;
            }
        }
        return ans.toString();
    }
    public String frequencySort(String s) {
/*        int[] freq = new int[256];

        // Count frequency
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        StringBuilder ans = new StringBuilder();
        while (true) { // infinite while loop
            int maxFreq = 0;
            int index = -1;

            // Find character having maximum frequency
            for (int i = 0; i < 256; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    index = i;
                }
            }

            // No characters left, break the infinite looping
            if (maxFreq == 0)
                break;

            // Append character maxFreq times
            while (maxFreq-- > 0) {
                ans.append((char) index);
            }

            // Mark as processed
            freq[index] = 0;
        }

        return ans.toString();
*/      

        return isOptimalSol(s);
    }
}