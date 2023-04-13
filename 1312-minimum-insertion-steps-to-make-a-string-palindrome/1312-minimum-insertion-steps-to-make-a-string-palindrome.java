class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int m=n;
        String str2=new StringBuilder(s).reverse().toString();
        int[][]dp=new int[n+1][m+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=lcs(s,str2,n,m,dp);
        return s.length()-ans;
    }
    int lcs(String str1,String str2,int n,int m,int dp[][]){
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(n==0||m==0){
            return 0;
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){
            dp[n][m]= 1+lcs(str1,str2,n-1,m-1,dp);
        }
        else {
            dp[n][m]= Math.max(lcs(str1,str2,n-1,m,dp),lcs(str1,str2,n,m-1,dp));
        }
        return dp[n][m];
    }
}