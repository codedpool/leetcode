class Solution {
    public int maxProduct(int[] nums) {
        int s=0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length;j++){
                if(((nums[i]-1)*(nums[j]-1))>s)
                s=(nums[i]-1)*(nums[j]-1);
            }
        }
        return s;
    }
}