class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+2];
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<dp.length;i++){
            dp[i]=nums[i-2];
        }
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i]+dp[i-2]);
        }
        return dp[dp.length-1];
    }
}
