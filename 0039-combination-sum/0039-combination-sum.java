class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>>ans=new HashSet<>();  // [[]]
        List<Integer>temp=new ArrayList<>();
        int ptr=0;
        sumHelper(candidates,target,ans,temp,ptr);
        return new ArrayList(ans);
    }
    private void sumHelper(int arr[],int target,Set<List<Integer>>ans,List<Integer>temp,int ptr){
        if(target<0){
            return;
        }
        if(target==0){
            List<Integer>list=new ArrayList(temp);
            Collections.sort(list);
            ans.add(list);
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            temp.add(arr[i]);
            sumHelper(arr,target-arr[i],ans,temp,i);
            temp.remove(temp.size()-1);
        }
    }
}