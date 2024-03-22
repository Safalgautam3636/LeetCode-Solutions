class Solution {
    public int findMin(int[] nums) {
        int first=0;
        int last=nums.length-1;
      
        while(first<=last){
            int mid=first+(last-first)/2;
            int prev=(mid-1+ nums.length)%nums.length;
            int next=(mid+1)%nums.length;
            System.out.println(prev+" "+mid+" "+next);
            if(nums[mid]<=nums[prev]&&nums[mid]<=nums[next]){
                return nums[mid];
            }
            else if(nums[mid]<nums[last]){
                last=mid;
                
            }
            else{
                first=mid+1;
            }
        }
        return -1;
    }
}