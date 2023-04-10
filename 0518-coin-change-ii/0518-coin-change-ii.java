class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n+1][amount+1];
        for(int[]item:dp){
            Arrays.fill(item,-1);
        }
        return coinChange(amount,coins,n,dp);
        
    }
    int coinChange(int amount,int[]coins,int n,int[][]dp){
        if(dp[n][amount]!=-1){
            return dp[n][amount];
        }
        if(amount==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(amount-coins[n-1]>=0){
            return dp[n][amount] = coinChange(amount-coins[n-1],coins,n,dp)+coinChange(amount,coins,n-1,dp);
        }
        else{
            return dp[n][amount]= coinChange(amount,coins,n-1,dp);
        }
        
    }
}