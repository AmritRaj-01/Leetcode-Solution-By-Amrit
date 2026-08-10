class Solution {
    public boolean canJump(int[] nums) {
        int final_step=nums.length-1;
        for(int idx=nums.length-2;idx>=0;idx--){
            if(idx+nums[idx]>=final_step){
                final_step=idx;
            }
        }
        return final_step==0;
    }
}