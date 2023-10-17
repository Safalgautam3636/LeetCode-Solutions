class Solution {
    public int longestConsecutive(int[] nums) {
        //idk this problem lol
        HashSet<Integer>hash=new HashSet<>();
        for(int x:nums){
            hash.add(x);
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            int currSum=1;
            if(!hash.contains(current-1)){
                while(hash.contains(current+1)){
                    current++;
                    currSum++;
                }
                max=Math.max(currSum,max);
            }
        }
        return max;
    }
}