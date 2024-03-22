class Solution {
    public int findMin(int[] nums) {
        int first=0;
        int last=nums.length-1;
        //[1,2]
        // first=0 , last=1 while(first<=last)-> true
        // mid=0 prev=1 and next=1
        if (nums[first] <= nums[last]) {
            return nums[first];
        }
        while(first<=last){
            int mid=first+(last-first)/2;
            int prev=(mid-1+ nums.length)%nums.length;
            int next=(mid+1)%nums.length;
            System.out.println(prev+" "+mid+" "+next);
            if(nums[mid]<=nums[prev]&&nums[mid]<=nums[next]){
                return nums[mid];
            }
            else if(nums[mid]>nums[last]){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return -1;
    }
}