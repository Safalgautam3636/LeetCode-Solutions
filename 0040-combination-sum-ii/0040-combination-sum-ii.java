class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>>ans=new HashSet<>();
        Arrays.sort(candidates);
        findCombinations(candidates,ans,0,target,new ArrayList<>());
        return new ArrayList<>(ans);
    }
    void findCombinations(int[]candidates,Set<List<Integer>>ans,int i,int target,List<Integer>instance){
        if(target==0){
            ans.add(new ArrayList(instance));
        }
        if(target<0){
            return;
        }
        int prev=-1;
        for(int idx=i;idx<candidates.length;idx++){
            int current=candidates[idx];
            if(prev==current){
                continue;
            }
            if(current<=target){
                instance.add(current);
                target=target-current;
                findCombinations(candidates,ans,idx+1,target,instance);
                target=target+current;
                instance.remove(instance.size()-1);
                prev=current;
            }
        }
    }
}