class Solution {
    public int[] productExceptSelf(int[] nums) {
        // [][][][][][][][][][]
        // [1,2,3,4]
        // [1, 2, 6, 24]
        // [24,24,12,4]
        // [24,12,8, 6]
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i];
        }
        suffix[nums.length-1]=nums[nums.length-1];
        for(int j=nums.length-2;j>=0;j--){
            suffix[j]=suffix[j+1]*nums[j];
        }
        int[]ans=new int[nums.length];
        for(int k=0;k<nums.length;k++){
            if(k==0){
                ans[k]=suffix[k+1];
            }
            else if(k==nums.length-1){
                ans[k]=prefix[k-1];
            }
            else
                ans[k]=prefix[k-1]*suffix[k+1];
        }
        return ans;
    }
}