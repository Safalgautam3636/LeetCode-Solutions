class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int nums1[]=new int[nums.length-1];
        int nums2[]=new int[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                nums1[i]=nums[i];
                continue;
            }
            if(i==nums.length-1){
                nums2[i-1]=nums[i];
                break;
            }
            nums1[i]=nums[i];
            nums2[i-1]=nums[i];
            
            
        }
        return Math.max(rob1(nums1),rob1(nums2));
    }
    public int rob1(int[] nums) {
        int dp[]=new int[nums.length+2];
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<dp.length;i++){
            dp[i]=nums[i-2];
        }
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i]+dp[i-2]);
        }
        return dp[dp.length-1];
    }
}