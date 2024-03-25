class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>>ans=new HashSet<>();
        dfs(candidates,target,ans,new ArrayList<>(),0,0);
        return new ArrayList(ans);
    }
    private void dfs(int[]candidates,int target,Set<List<Integer>>ans,ArrayList<Integer>temp,int sum,int index){
        if(target<0)return;
        if(target==0){
            
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            temp.add(candidates[i]);
            dfs(candidates,target-candidates[i],ans,temp,sum,i);
            temp.remove(temp.size()-1);
        }
    }
}