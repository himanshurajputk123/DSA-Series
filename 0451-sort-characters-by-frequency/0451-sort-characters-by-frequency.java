class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];

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
    }
}