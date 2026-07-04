class Solution {
    List<Integer> generatedRow(int row){
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        
        // 0th column => 1
        ansRow.add(ans);
        for(int col = 1; col<row; col++){
            ans *= (row-col);
            ans /= col;

            ansRow.add(ans);
        }
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 1; i<=numRows; i++){
            list.add(generatedRow(i));
        }
        return list;
    }
}