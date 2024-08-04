class Solution {
    public int primePalindrome(int n) {
        if (8 <= n && n <= 11) {
            return 11;
        }

        for (int i = 1; i < 20000; i++) {
            String s = Integer.toString(i);
            String r = new StringBuilder(s).reverse().toString();
            int x = Integer.parseInt(s + r.substring(1)); // Generate odd length palindromes
            if (x >= n && isPrime(x)) {
                return x;
            }
        }
        return -1;
    }

    private boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        if (x % 2 == 0) {
            return x == 2;
        }
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 31;
        System.out.println(solution.primePalindrome(n)); // Output: 101
    }
}