class Solution {
    public int findPeakElement(int[] nums) {
        int first=0;
        int last=nums.length-1;
    
        while(first<=last){
            int mid=first+(last-first)/2;
            if(mid>0&&mid<nums.length-1){
                if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                    return mid;
                }
                else if(nums[mid]<nums[mid+1]){
                    first=mid+1;
                }
                else{
                    last=mid-1;
                }
            }
            if(mid==0){
                if(mid+1<=nums.length-1){
                    if(nums[mid]>nums[mid+1]){
                        return mid;
                    }
                    return mid+1;
                }
                return mid;
            }
            if(mid==nums.length-1){
                if(mid-1>=0){
                    if(nums[mid]>nums[mid-1]){
                        return mid;
                    }
                    return mid-1;
                }
                return mid;
            }
        }
        return first;
    }
}