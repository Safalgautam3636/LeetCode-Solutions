class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        backtrack(nums,0,ans,temp);
        return ans;
    }
    void backtrack(int[]nums,int i,List<List<Integer>>ans,List<Integer>temp){
        if(i==nums.length){
            ans.add(new ArrayList(temp));
            return;
        }
        int element=nums[i];
        temp.add(nums[i]);
        backtrack(nums,i+1,ans,temp);
        temp.remove(temp.size()-1);
        backtrack(nums,i+1,ans,temp);
    }
}