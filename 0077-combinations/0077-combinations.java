class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        
        backtrack(arr,k,ans,new ArrayList<>(),0);
        return ans;
    }
    void backtrack(int arr[],int k,List<List<Integer>>ans,ArrayList<Integer>instance,int i){
        if(k==0){
            ans.add(new ArrayList(instance));
            return;
        }
        for(int idx=i;idx<arr.length;idx++){
            instance.add(arr[idx]);
            backtrack(arr,k-1,ans,instance,idx+1);
            instance.remove(instance.size()-1);
        }
        
        
        
    }
}