class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>eachInstance=new ArrayList<>();
        int i=0;
        recu(nums,eachInstance,ans,i);
        return ans;

    }
    public void recu(int[]input,List<Integer>include,List<List<Integer>>ans,int i){
        if(i==input.length){
            ans.add(new ArrayList(include));
            return;
        }
        include.add(input[i]);
        
        recu(input,include,ans,i+1);
        
        include.remove(include.size()-1);
        
        recu(input,include,ans,i+1);
    }
}