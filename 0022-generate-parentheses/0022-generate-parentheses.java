class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        dfs(0,0,ans,"",n);
        return ans;
    }
    public void dfs(int open,int close,List<String>ans,String instance,int n){
        if(open==n&&close==n){
            ans.add(instance);
            return;
        }
        if(open>close){
            dfs(open,close+1,ans,instance+")",n);
        }
        if(open!=n){
            dfs(open+1,close,ans,instance+"(",n);
        }
//         if(open==n){
//             dfs(open,close+1,ans,instance+")",n);
//         }
        
    }
}