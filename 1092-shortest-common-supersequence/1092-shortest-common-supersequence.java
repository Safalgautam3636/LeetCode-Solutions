class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        int lcsLength=lcs(str1,str2,n,m,dp);
        String lcsString=lcsString(str1,str2,n,m,dp);
        // Compute length of shortest common supersequence
        int superseqLen = n + m - dp[n][m];
        
        // Construct shortest common supersequence
        StringBuilder sb = new StringBuilder();
        int i = n, j = m;
        while(i > 0 && j > 0) {
            if(str1.charAt(i-1) == str2.charAt(j-1)) {
                sb.append(str1.charAt(i-1));
                i--;
                j--;
            } else if(dp[i-1][j] > dp[i][j-1]) {
                sb.append(str1.charAt(i-1));
                i--;
            } else {
                sb.append(str2.charAt(j-1));
                j--;
            }
        }
        
        while(i > 0) {
            sb.append(str1.charAt(i-1));
            i--;
        }
        while(j > 0) {
            sb.append(str2.charAt(j-1));
            j--;
        }
        
        return sb.reverse().toString();
        
    }
    int lcs(String str1,String str2,int n,int m,int [][]dp){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j]=0;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    String lcsString(String str1,String str2,int n,int m,int[][]dp){
        String ans="";
        while(n>0&&m>0){
            if(str1.charAt(n-1)==str2.charAt(m-1)){
                ans+=str1.charAt(n-1);
                n--;
                m--;
            }
            else{
                if(dp[n-1][m]>dp[n][m-1]){
                    n--;
                }
                else{
                    m--;
                }
            }
        }
        
        StringBuilder str=new StringBuilder(ans);
        return str.reverse().toString();
        
    }
    
}