class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,-1);
        int result = coinChangew(amount, coins,dp);
        
        if(result==Integer.MAX_VALUE||result==Integer.MAX_VALUE-1){
            return -1;
        }
        return result;
    }
    
    int coinChangew(int amount, int[] coins,int dp[]) {
        // if(dp[]!=-1){
        //     return dp[];
        // }
        // if (amount == 0) {
        //     return c;
        // }
        // if (n < 0 || amount < 0) {
        //     return Integer.MAX_VALUE;
        // }
        // int withCoin = coinChangew(amount - coins[n], coins, n, c + 1,dp);
        // int withoutCoin = coinChangew(amount, coins, n - 1, c,dp);
        // if (withCoin == Integer.MAX_VALUE && withoutCoin == Integer.MAX_VALUE) {
        //     return Integer.MAX_VALUE;
        // }
        // return dp[n]= Math.min(withCoin, withoutCoin);
        if(dp[amount]!=-1){
            return dp[amount];
        }
        if(amount==0){
            return 0;
        }
        int min=Integer.MAX_VALUE-1;
        for(int i=0;i<coins.length;i++){
            if(amount-coins[i]>=0){
                min=Math.min(min,1+coinChangew(amount-coins[i],coins,dp));
            }
        }
        return dp[amount]= min;
    }
}
