class Solution { 
    public static void helperFunc(int k, int n, int i, List<List<Integer>> ans, List<Integer> list){
        
        if(n == 0 && list.size() == k){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(i > n) return;

        if(i >= 1 && i <= 9){
            list.add(i); // include
            helperFunc(k, n-i, i+1, ans, list);

            list.removeLast(); // exclude
            helperFunc(k, n, i+1, ans, list);
        }
        
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helperFunc(k, n, 1, ans, new ArrayList<>());
        return ans;
        
    }
}