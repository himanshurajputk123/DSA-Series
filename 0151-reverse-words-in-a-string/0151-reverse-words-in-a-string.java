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
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;
        while(i >= 0){
            // remove all trailing spaces
            while(i >= 0 && s.charAt(i) == ' ') i--;
            // check value of i
            if(i<0) break;
            int j = i;
            while(j >= 0 && s.charAt(j) != ' ') j--;
            // jaise hi space vale idx pr aa jayega toh ruk jayega 
            // ab isko ans me append kr lo
            ans.append(s.substring(j+1, i+1));
            // remove space where j is standing & add a space in between
            while(j >= 0 && s.charAt(j) == ' ') j--;
            if(j >= 0) ans.append(' ');

            i = j;
        }
        return ans.toString();
    }
}