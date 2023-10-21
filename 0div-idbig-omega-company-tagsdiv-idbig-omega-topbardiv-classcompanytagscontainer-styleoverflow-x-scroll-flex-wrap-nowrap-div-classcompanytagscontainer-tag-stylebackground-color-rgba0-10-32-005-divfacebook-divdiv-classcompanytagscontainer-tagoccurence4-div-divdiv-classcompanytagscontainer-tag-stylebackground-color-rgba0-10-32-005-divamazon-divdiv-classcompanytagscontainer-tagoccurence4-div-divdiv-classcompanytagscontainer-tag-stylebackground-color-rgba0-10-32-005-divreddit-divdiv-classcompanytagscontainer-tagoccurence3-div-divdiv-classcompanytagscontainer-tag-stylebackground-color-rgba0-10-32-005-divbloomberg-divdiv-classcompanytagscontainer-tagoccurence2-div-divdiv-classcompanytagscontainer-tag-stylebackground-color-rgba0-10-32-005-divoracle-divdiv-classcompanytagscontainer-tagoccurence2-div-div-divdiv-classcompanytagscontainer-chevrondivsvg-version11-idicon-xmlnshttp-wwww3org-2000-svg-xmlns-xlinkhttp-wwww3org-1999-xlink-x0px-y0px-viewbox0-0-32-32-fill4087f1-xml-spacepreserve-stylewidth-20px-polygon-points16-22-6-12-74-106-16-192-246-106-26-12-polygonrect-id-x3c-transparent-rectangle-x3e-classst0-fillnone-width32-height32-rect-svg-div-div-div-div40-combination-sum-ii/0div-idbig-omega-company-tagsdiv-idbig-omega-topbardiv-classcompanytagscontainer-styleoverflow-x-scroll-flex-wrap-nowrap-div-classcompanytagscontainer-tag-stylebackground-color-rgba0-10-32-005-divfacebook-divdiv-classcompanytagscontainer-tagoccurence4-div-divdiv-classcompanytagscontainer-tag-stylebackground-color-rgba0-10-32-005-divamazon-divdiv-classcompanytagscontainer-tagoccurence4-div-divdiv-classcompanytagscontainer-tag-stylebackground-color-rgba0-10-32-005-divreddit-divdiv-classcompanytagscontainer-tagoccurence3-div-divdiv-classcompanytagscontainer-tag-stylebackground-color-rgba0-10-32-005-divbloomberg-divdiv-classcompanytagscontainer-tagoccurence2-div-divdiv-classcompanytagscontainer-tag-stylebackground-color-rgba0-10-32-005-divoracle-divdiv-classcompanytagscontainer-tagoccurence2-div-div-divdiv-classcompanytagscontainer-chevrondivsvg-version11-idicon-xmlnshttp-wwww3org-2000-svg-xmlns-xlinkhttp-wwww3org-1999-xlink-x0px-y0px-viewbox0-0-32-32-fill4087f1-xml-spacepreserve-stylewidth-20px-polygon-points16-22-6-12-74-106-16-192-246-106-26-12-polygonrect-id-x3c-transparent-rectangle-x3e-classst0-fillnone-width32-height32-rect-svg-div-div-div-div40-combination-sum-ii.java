class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer>subans=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        backtrack(candidates,target,0,0,subans,ans);
        return ans;
    }
    void backtrack(int[]candidates,int target,int sum,int index,List<Integer>subans,List<List<Integer>>ans){
        if(index>candidates.length)return;
        if(sum>target)return;
        if(sum==target){
            ans.add(new ArrayList<>(subans));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            //dont understand why i>index instead of i>0
            if(i!=index&&candidates[i]==candidates[i-1]){
                continue;
            }
            subans.add(candidates[i]);
            backtrack(candidates,target,sum+candidates[i],i+1,subans,ans);
            
            subans.remove(subans.size()-1);
            
        }
        
    }
}