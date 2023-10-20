class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        HashSet<List<Integer>> ans=new HashSet<>();
        List<Integer>temp=new ArrayList<>();
        backtrack(candidates,target,ans,0,temp);
        
        return new ArrayList(ans);
    }
    void backtrack(int[]candidates,int target,HashSet<List<Integer>> ans,int sum,List<Integer>temp ){
        if(sum>target){
            return;
        }
        if(sum==target){
            List<Integer>store=new ArrayList(temp);
            Collections.sort(store);
            ans.add(store);
            return;
        }
        for(int itr=0;itr<candidates.length;itr++){
            temp.add(candidates[itr]);
            backtrack(candidates,target,ans,sum+candidates[itr],temp);
            temp.remove(temp.size()-1);
        }
    }
}