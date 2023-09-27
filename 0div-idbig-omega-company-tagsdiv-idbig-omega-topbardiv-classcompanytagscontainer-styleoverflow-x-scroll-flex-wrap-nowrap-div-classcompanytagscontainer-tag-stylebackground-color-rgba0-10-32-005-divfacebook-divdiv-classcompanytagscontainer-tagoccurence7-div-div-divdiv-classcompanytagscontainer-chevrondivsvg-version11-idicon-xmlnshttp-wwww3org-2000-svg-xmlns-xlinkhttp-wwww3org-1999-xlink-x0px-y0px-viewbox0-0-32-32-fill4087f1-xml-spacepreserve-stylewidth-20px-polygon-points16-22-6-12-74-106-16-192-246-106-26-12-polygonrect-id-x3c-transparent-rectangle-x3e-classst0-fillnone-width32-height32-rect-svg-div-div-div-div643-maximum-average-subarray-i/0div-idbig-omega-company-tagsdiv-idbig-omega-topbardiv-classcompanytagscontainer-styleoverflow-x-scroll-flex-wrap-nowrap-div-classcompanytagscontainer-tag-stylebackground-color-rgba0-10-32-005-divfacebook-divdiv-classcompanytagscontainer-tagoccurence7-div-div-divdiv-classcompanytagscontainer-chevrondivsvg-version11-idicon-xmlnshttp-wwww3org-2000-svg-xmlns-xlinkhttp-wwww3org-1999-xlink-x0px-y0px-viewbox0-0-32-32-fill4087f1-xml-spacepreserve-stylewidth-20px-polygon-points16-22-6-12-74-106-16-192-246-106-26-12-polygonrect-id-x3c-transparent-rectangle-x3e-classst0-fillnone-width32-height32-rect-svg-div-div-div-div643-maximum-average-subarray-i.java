class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int store=0;
        for(int i=0;i<=k-1;i++){
            store+=nums[i];
        }
        int first=0;
        int second=k;
        int ans=store;
        for(int i=first;i<=nums.length-1&&second<=nums.length-1;i++){
            store-=nums[i];
            store+=nums[second++];
            ans=Math.max(ans,store);
        }
        return (double)(double)ans/(double)k;
        
    }
}