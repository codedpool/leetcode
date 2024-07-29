class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];  
        for (int i = 0; i <= n; i++) {
            int res = 0;
            int num = i;  

            // Count the number of 1's in the binary representation of num
            while (num != 0) {
                if ((num & 1) == 1)
                    res++;
                num = num >> 1;
            }
            arr[i] = res;  
        }
        return arr;  
    }
}
