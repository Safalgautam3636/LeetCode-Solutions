class Solution {
    static int dp[];
    Solution(){
         dp=new int[38];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        
    }
    
    public int tribonacci(int n) {
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n]=tribonacci(n-3)+tribonacci(n-2)+tribonacci(n-1);
    }
}