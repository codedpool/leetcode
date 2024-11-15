class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int result = 0;

        for (int i = 0; i < nums.size(); i++) {
            int index = i; // Use index to count its set bits
            int count = 0;

            // Count the number of 1's in the binary representation of the index
            while (index != 0) {
                count += index & 1; // Increment count if the last bit is 1
                index = index >> 1; // Right shift to check the next bit
            }

            // If the count of set bits matches k, add the value at this index
            if (count == k) {
                result += nums.get(i);
            }
        }

        return result;
    }
}
