class Solution {
    public boolean checkString(String s) {
        int i = 0; 
        int j = i + 1;        
        while(j < s.length()){
            String sub = s.substring(i, j + 1);
            if(sub.equals("ba")) return false;
            else {
                i++;
                j++;
            }
        }
        return true;
    }
}