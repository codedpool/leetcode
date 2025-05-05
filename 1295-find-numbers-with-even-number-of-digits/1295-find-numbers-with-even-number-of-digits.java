class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            int digitCount = Integer.toString(nums[i]).length();
            if (digitCount % 2 == 0) {
                c++;
            }
        }
        return c;
    }
}
