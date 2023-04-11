class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n+1][m+1];
        for(int[]val:dp){
            Arrays.fill(val,-1);
        }
        int ans=dfs(text1,text2,n,m,dp);
        return ans;
    }
    int dfs(String str1,String str2,int n,int m,int[][]dp){
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(m==0||n==0){
            return 0;
            
        }
        else if(str1.charAt(n-1)==str2.charAt(m-1)){
            return dp[n][m]=1+dfs(str1,str2,n-1,m-1,dp);
        }
        else{
            return dp[n][m]=Math.max(dfs(str1,str2,n-1,m,dp),dfs(str1,str2,n,m-1,dp));
        }
    }
}