class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;  // No primes less than 2

        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);

        int count = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (primes[i]) count++;
        }

        return count;
    }
}
