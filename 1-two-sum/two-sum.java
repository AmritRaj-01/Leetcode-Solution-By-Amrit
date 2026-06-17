class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int ans[]={-1};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int sum=target-nums[i];
            if(mp.containsKey(sum)){
                ans=new int[]{i,mp.get(sum)};
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
}