class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hash=new HashSet<>();
        for(int num:nums){
            hash.add(num);
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(!hash.contains(nums[i]-1)){
                int counter=1;
                int ele=nums[i]+1;
                while(hash.contains(ele)){
                    ele=ele+1;
                    counter++;
                    
                }
                ans=Math.max(ans,counter);
            }
        }
        return ans;
    }
}