class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1; // Edge case: the complement of 0 is 1
        
        // Calculate the bit length of n
        int bitLength = Integer.toBinaryString(n).length();
        
        // Create a mask with all bits set to 1 of the same length as n
        int mask = (1 << bitLength) - 1;
        
        // XOR n with the mask to get the complement
        return n ^ mask;
    }
}
