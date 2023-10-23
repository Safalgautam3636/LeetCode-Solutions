class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        Arrays.sort(nums);
        
        int ans=0;
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            if(nums[i-1]+1==nums[i]){
                count++;
            }
            else{
                count=0;
            }
            ans=Math.max(ans,count);
        }
        return ans+1;
    }
}