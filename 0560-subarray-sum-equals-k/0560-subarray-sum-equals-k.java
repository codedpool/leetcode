class Solution {
    public int subarraySum(int[] nums, int k) {
        int l = nums.length;
        int c = 0;
        for (int i = 0; i < l; i++) {
            int s = 0;
            for (int j = i; j < l; j++) {
                s += nums[j];
                if (s == k) c++;
            }
        }
        return c;
    }
}
