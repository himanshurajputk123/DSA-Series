class Solution {
    public String convert(String s, int numRows) {
        // edge case
        if(numRows == 1) return s;
        // row, direction, rows[] = stringbuilder
        StringBuilder[] rows = new StringBuilder[numRows];
        int direction = 0; // 0 => down && 1 => up;
        int row = 0;
/* 
=> Creating an array of objects does not create the objects themselves. We're rewuired to initizialise them as well 
=> Have I initialized the objects at each index before accessing their methods or fields?

*/

        // initialization of StringBuilders
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
         
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if( row < numRows && direction == 0){
                rows[row].append(ch);
                if(row == numRows - 1) {
                    direction = 1;
                    row = numRows - 2;
                }
                else row++;

            }
            else if(row >= 0 && direction == 1){
                rows[row].append(ch);
                if(row == 0){
                    direction = 0;
                    row = 1;
                }
                else row--;
                
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            result.append(rows[i]);
        }

        return result.toString();
    }
}