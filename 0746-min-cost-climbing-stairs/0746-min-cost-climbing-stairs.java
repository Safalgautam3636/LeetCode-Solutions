class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int ans = Integer.MAX_VALUE;
        int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(fun(cost, 0,dp), fun(cost, 1,dp));
    }
    
    int fun(int[] cost, int i,int[]dp) {
    
        if (i >= cost.length) {
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        
        int firstStep = fun(cost, i + 1,dp) + cost[i];
        int secondStep = fun(cost, i + 2,dp) + cost[i];
        
        return dp[i]=Math.min(firstStep, secondStep);
    }
}
