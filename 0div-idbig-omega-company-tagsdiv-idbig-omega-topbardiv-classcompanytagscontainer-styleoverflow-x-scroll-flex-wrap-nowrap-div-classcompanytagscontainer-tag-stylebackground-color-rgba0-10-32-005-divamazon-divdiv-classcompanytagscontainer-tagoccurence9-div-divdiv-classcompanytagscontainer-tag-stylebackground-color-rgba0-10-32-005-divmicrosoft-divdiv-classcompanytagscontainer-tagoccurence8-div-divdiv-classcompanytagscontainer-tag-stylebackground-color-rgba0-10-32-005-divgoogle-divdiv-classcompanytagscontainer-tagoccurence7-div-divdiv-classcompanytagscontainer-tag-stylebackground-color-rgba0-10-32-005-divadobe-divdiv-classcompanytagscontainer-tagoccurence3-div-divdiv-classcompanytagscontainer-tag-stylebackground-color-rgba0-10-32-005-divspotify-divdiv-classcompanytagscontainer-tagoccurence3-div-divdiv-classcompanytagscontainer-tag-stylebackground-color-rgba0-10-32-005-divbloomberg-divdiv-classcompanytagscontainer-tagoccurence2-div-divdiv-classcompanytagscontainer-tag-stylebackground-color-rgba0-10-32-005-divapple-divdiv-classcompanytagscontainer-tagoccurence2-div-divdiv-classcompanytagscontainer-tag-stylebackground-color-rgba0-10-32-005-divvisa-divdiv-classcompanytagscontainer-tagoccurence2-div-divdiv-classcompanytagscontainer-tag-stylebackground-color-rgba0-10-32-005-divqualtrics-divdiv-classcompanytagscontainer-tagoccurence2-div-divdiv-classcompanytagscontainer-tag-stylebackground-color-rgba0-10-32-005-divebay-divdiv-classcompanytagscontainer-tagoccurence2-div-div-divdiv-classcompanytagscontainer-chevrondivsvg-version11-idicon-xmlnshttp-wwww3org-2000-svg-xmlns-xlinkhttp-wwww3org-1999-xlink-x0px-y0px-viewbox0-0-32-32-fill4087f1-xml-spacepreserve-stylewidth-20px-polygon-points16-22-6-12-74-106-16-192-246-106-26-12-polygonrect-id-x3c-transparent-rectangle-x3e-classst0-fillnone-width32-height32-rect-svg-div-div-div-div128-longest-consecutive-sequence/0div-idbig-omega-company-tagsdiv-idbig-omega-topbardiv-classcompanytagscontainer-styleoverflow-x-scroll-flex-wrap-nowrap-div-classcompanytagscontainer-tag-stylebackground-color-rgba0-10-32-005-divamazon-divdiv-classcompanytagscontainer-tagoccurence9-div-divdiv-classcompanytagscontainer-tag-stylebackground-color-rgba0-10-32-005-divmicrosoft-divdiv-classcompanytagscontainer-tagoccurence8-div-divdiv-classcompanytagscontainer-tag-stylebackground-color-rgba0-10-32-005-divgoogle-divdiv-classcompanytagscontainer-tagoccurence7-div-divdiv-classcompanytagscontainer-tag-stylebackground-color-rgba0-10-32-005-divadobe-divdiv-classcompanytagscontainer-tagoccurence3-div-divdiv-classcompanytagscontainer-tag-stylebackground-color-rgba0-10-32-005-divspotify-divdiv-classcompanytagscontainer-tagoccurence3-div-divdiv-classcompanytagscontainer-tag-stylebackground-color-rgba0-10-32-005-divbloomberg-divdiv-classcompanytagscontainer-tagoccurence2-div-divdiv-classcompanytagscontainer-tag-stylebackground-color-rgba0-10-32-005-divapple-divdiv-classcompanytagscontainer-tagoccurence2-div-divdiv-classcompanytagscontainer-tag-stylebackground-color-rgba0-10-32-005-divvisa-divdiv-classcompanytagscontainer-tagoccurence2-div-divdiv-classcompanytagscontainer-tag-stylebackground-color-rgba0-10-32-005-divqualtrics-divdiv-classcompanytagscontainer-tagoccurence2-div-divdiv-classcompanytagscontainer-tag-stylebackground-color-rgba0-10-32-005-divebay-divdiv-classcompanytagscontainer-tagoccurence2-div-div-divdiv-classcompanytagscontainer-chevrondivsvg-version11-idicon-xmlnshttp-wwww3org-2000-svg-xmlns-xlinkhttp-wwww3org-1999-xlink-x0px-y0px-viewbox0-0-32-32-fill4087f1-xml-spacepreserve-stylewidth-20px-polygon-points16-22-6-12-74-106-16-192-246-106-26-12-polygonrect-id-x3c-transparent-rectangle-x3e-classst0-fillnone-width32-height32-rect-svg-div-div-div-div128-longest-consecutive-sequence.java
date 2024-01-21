class Solution {
    public int longestConsecutive(int[] nums) {
        //O(nlogn)+O(n)
        // max value of the array 
        // that way i can find 
        if(nums.length==0)return 0;
        HashSet<Integer>hash=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hash.add(nums[i]);
        }
        int length=1;
        int globalLength=1;
        for(int j=0;j<nums.length;j++){
            int next=nums[j]+1;
            if(!hash.contains(nums[j]-1)){
                length=1;
                while(hash.contains(next)){
                    length++;
                    next++;
                }
                globalLength=Math.max(globalLength,length);
            }
        }
        return globalLength;
    }
}