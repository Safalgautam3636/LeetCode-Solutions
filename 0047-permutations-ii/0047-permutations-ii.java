class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();

        permutation(nums,ans,0);
        return new ArrayList(ans);

    }
    static void permutation(int arr[],HashSet<List<Integer>>ans,int idx)
    {
        if(arr.length==idx){
            List<Integer>answer=new ArrayList<>();
            for(int x:arr){
                answer.add(x);
            }
            ans.add(new ArrayList<>(answer));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            swap(arr,i,idx);
            permutation(arr,ans,idx+1);
            swap(arr,i,idx);
        }
    }
    static void swap(int []input,int i,int j)
    {
        int temp=input[i];
        input[i]=input[j];
        input[j]=temp;
    }

}