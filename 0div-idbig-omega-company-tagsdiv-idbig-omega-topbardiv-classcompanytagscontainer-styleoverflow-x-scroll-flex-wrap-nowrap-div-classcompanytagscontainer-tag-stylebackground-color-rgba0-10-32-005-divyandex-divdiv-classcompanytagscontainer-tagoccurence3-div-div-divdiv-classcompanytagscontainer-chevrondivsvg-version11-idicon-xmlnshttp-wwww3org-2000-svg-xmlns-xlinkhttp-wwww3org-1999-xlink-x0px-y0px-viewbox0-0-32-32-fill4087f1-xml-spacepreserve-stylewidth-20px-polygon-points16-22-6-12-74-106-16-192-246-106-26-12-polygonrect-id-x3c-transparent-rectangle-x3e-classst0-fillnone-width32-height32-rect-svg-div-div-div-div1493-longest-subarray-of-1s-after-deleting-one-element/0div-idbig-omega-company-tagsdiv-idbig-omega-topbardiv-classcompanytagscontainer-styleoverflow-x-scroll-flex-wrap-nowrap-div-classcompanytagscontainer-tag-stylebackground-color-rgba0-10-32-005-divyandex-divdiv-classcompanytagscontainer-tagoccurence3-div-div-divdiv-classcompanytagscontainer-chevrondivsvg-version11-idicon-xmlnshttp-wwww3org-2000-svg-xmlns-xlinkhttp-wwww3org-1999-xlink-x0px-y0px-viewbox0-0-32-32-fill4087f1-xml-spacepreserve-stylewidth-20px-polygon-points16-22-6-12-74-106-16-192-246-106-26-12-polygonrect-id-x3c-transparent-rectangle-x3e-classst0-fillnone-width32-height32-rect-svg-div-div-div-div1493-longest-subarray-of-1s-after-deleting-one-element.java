class Solution {
    public int longestSubarray(int[] nums) {
        int start=0;
        int zero=0;
        int ans=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end]==0){
                zero++;
            }
            while(zero>1){
                if(nums[start]==0){
                    zero--;
                }
                start++;
            }
            ans=Math.max(ans,end-start);
        }
        return ans;
    }
}