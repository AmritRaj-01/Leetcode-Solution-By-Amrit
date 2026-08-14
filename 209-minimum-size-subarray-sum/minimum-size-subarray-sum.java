class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int currSum=0;
        int minlen=Integer.MAX_VALUE;
        int low=0;
        int high=0;
        while(high<n){
            currSum+=nums[high];
            high++;
            while(currSum>=target){
                int currSize=high-low;
                minlen=Math.min(minlen,currSize);
                currSum-=nums[low];
                low++;
            }
        }
        return minlen==Integer.MAX_VALUE ? 0: minlen;
    }
}