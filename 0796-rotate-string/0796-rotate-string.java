class Solution {
    public boolean bruteForce(String s, String goal){
        // bruteForce is rotate characters of string one by one
        // T.C => O(n * n)
        // S.C => O(n) currentString ki vjh se

        if(s.length() != goal.length()){
            return false;
        }
        String currentString = s;

        for(int i = 0; i<s.length(); i++){
            // check if s == goals?
            if(currentString.equals(goal)){
                return true;
            }
            currentString = currentString.substring(1) + currentString.charAt(0);
            
        }
        return false;
    }
    public boolean rotateString(String s, String goal) {
        
            // both space and time complexity => O(n)
        if(s.length() != goal.length()){
            return false;
        }
        return (s + s).contains(goal); // O(n)

        //return bruteForce(s, goal);
    }
}