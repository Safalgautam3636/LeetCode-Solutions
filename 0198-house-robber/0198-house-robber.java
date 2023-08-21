class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        
        return dpSol(nums,0,dp);
    }
    public static int dpSol(int nums[],int i,int dp[]){
        if(i==nums.length-1){
            return nums[i];
        }
        if(i>nums.length-1){
            return 0;
        }
        if(dp[i]!=-1)
            return dp[i];
        return dp[i]=Math.max(nums[i]+dpSol(nums,i+2,dp),dpSol(nums,i+1,dp));
        
        
    }
}