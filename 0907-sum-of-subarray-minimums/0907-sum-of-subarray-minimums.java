class Solution {
    public int betterSol(int[] arr) {
        int mod = 1_000_000_007;
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            for (int j = i; j < n; j++) {
                min = Math.min(arr[j], min);
                sum = (sum + min) % mod;
            }
        }
        return (int) sum;
    }

    public static int[] reverseArr(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }

    public static int[] nextSmallerEle(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            ans[i] = st.isEmpty() ? n : st.peek();

            st.push(i);
        }

        return ans;
    }

    public static int[] prevSmaller(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            ans[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);
        }

        return ans;
    }

    public int sumSubarrayMins(int[] arr) {
        //return betterSol(arr);
        int n = arr.length;
        long sum = 0;
        int mod = 1_000_000_007;
        int[] nse = nextSmallerEle(arr);
        int[] pse = prevSmaller(arr);
        for (int i = 0; i < n; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;

            long contribution = (left * right * arr[i]) % mod;

            sum = (sum + contribution) % mod;
        }
        return (int) sum;
    }
}