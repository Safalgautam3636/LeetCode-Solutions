class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int start=0;
        int window=0;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            window++;
            if(nums[i]==0){
                zero++;
            }
            while(zero>k){
                if(nums[start]==0){
                    zero--;
                }
                start++;
            }
            ans=Math.max(ans,i-start+1);
        }
        return ans;
    }
}
