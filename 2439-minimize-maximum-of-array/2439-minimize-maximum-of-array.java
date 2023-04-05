class Solution {
    public int minimizeArrayValue(int[] nums) {
        long ans=0;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans=Math.max(ans,(sum+i)/(i+1));
            
        }
        return (int)ans;
    }
}