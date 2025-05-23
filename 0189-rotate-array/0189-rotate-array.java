class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] result = new int[len];

        for(int i = 0; i<len; i++){
            result[(i+k)%len] = nums[i];
        }
        for(int i =0; i<len; i++){
            nums[i] = result[i];
        }
    }
}