class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3) return false;
        int i=Integer.MAX_VALUE;
        int j=Integer.MAX_VALUE;
        for(int k=0;k<nums.length;k++){
            if(nums[k]<=i){
                i=nums[k];
            }else if(nums[k]<=j){
                j=nums[k];
            }else{
                return true;
            }
        }
        return false;
    }
}