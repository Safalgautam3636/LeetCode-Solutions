class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>>ans=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        for(int x:nums){
            current.add(x);
        }
        backtrack(current,new ArrayList<>(),ans);
        return ans;
    }
    void backtrack(List<Integer>input,List<Integer>subans,List<List<Integer>>ans){
        if(input.size()==0){
            ans.add(new ArrayList(subans));
            return;
        }
        for(int i=0;i<input.size();i++){
            subans.add(input.get(i));
            List<Integer>list1=new ArrayList(input.subList(0,i));
            list1.addAll(input.subList(i+1,input.size()));
            backtrack(list1,subans,ans);
            subans.remove(subans.size()-1);
        }
    }
}