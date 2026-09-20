class Solution {
    public int reverseDegree(String s) {
        char[] chars = {'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 
                'o', 'n', 'm', 'l','k' ,'j' ,'i' ,'h' ,'g' ,'f' ,'e', 'd', 'c','b', 'a'};
                int sum = 0;
                int i = 1;
        for(char ch : s.toCharArray()){
            int digit = 'z' - ch + 1;
            sum += (digit * i);
            i++;
        }
        return sum;
    }
}