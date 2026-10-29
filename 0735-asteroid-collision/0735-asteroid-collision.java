
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int asteroid : asteroids) {
            boolean alive = true;

            while (alive && asteroid < 0
                    && !st.isEmpty() && st.peek() > 0) {

                if (st.peek() < Math.abs(asteroid)) {
                    st.pop(); // Stack asteroid explodes
                } else if (st.peek() == Math.abs(asteroid)) {
                    st.pop(); // Both explode
                    alive = false;
                } else {
                    alive = false; // Current asteroid explodes
                }
            }

            if (alive) {
                st.push(asteroid);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}