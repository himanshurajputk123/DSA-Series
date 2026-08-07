class Solution {
    public static int eratosthenesPrimeCount(int n){
        int cnt = 0;
        int[] prime = new int[n+1];
        for(int i = 2; i<n; i++){
            prime[i] = 1;
        }
        for(int i = 2; i*i<n; i++){
            if(prime[i] == 1){
                for(int j = i*i; j<n; j += i){
                    prime[j] = 0;
                }
            }
        }
        for(int i = 2; i<n; i++){
            if(prime[i] == 1) cnt++;
        }
        return cnt;
    }

    public static boolean checkPrimeOrNot(int n){
        if(n == 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3; i*i <= n; i += 2){ // we need not to check even numbers for prime that's why +2;
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public int countPrimes(int n) {
        if(n == 0 || n == 1 || n == 2) return 0;
        // int cnt = 0;
        // for(int i = 2; i<n; i++){
        //     if(checkPrimeOrNot(i)) cnt++;
        // }
        // return cnt;
        return eratosthenesPrimeCount(n);
        
    }
}