class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1)return 0;
        Arrays.sort(nums);
        int count=1;
        int max=1;
        // [1,2,3,4,100,200] ==>  
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
                
            }
            else if(nums[i+1]==nums[i]+1){
                count++;
                max=Math.max(max,count);
                System.out.println(count+" "+max);
                
            }
            else{
               
                
                count=1;
            }
        }
        return max;
    }
}