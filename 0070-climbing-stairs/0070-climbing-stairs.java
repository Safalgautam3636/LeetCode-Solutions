class Solution {
    public int dpSol(int n,int dp[]){
        
        if(n<0){
            return 0;
        }
        if(n==0||n==1){
            return 1;
        }
         if(dp[n]!=-1){
            return dp[n];
        }
        else{
            dp[n]= dpSol(n-1,dp)+dpSol(n-2,dp);
        }
        return dp[n];
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return dpSol(n,dp);
    }
}