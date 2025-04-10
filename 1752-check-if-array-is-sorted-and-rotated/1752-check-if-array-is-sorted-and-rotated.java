class Solution {
    public boolean check(int[] nums) {
        int gc = 0;

        for(int i=1; i<nums.length; i++){
            if(nums[i-1]>nums[i]){
                gc++;
            }
        }
        if(nums[nums.length-1]>nums[0]){
            gc++;
        }
        return gc<=1;
    }
}