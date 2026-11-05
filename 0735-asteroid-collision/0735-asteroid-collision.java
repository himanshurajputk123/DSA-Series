class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // after revision
        Stack<Integer> st = new Stack<>();
        for(int asteroid : asteroids){
            boolean alive = true;
            while(alive && asteroid < 0 && !st.isEmpty() && st.peek() > 0){
                if(Math.abs(asteroid) > st.peek()) st.pop();
                else if(Math.abs(asteroid) == st.peek()){
                    alive = false;
                    st.pop();                    
                }else alive = false;
            }
            if(alive) st.push(asteroid);
        }
        int[] ans = new int[st.size()];
        for(int i = st.size() - 1; i >= 0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}