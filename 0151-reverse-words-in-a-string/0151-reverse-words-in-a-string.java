class Solution {
    // not good as you're using split(), replaceAll()
    // which creates some overhead 
    // T.C = O(n) S.C = O(n);
    public static String bruteForce(String s){

        // removing trailing spaces
        s = s.trim();
        // removing middle spaces
        s = s.replaceAll("\\s+", " "); // \s matches any whitespace
        String [] words = s.split(" ");
        int left = 0;
        int right = words.length - 1;
        while(left < right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }
        return String.join(" ", words);
    }
    public String reverseWords(String s) {
        // think of optimal solution
        return bruteForce(s);
    }
}