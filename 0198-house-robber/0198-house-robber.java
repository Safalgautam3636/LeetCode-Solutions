class Solution {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return robber(nums,nums.length-1,dp);
        
    }
    int robber(int[]nums,int n,int dp[]){
        
        if(n==0){
            return nums[n];
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]= Math.max(nums[n]+robber(nums,n-2,dp),robber(nums,n-1,dp));
    }
}
