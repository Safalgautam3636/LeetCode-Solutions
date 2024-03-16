class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hash=new HashSet<>();
        for(int x:nums){
            hash.add(x);
        }
        
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int counter=1;
            int num=nums[i];
            if(!hash.contains(num+1)){
                while(hash.contains(num-1)){
                    counter++;
                    num--;
                }
            }
            ans=Math.max(ans,counter);        
        }
        return ans;
    }
}