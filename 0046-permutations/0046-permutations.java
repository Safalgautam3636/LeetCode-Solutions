class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList();
        List<Integer>output=new ArrayList<>();
        permutation(nums,output,ans,0);
        return ans;
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void permutation(int arr[],List<Integer>output,List<List<Integer>>ans,int idx){
        if(idx==arr.length){
            List<Integer>a=new ArrayList<>();
            for(int x:arr){
                a.add(x);
            }
            ans.add(a);
            return;
        }
        for(int i=idx;i<arr.length;i++){
            swap(arr,i,idx);
            permutation(arr,output,ans,idx+1);
            swap(arr,i,idx);
        }
    }

}