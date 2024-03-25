class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        dfs(nums,ans,new ArrayList<>(),0);
        return ans;
    }
    void dfs(int[]nums,List<List<Integer>>ans,List<Integer>temp,int index){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            
            if(temp.contains(nums[i]))
                continue;
            temp.add(nums[i]);
            dfs(nums,ans,temp,i+1);
            temp.remove(temp.size()-1);
            
        }
    }
}