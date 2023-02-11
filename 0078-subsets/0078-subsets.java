class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>eachInstance=new ArrayList<>();
        int i=0;
        recu(nums,eachInstance,ans,i);
        return ans;

    }
    public void recu(int[]input,List<Integer>eachInstance,List<List<Integer>>ans,int i){
        if(i==input.length){
            ans.add(eachInstance);
            return;
        }
        List<Integer>include=new ArrayList(eachInstance);
        List<Integer>exclude=new ArrayList(eachInstance);
        include.add(input[i]);
        recu(input,include,ans,i+1);
        recu(input,exclude,ans,i+1);
    }
}