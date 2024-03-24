class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        dfs(nums,ans,0,new ArrayList<>());
        return ans;
    }
    void dfs(int[]nums,List<List<Integer>>ans,int i,List<Integer>temp){

        if(i==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        List<Integer>lol=new ArrayList<>(temp);
        temp.add(nums[i]);
        
        dfs(nums,ans,i+1,temp);
        
        dfs(nums,ans,i+1,lol);
    }
}