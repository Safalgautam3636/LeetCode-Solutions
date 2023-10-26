class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[]ans={-1,-1};
        int firstIndex=getFromFirst(nums,target,'f');
        int secondIndex=getFromFirst(nums,target,'l');
        ans[0]=firstIndex;
        ans[1]=secondIndex;
        return ans;
        
    }
    int getFromFirst(int[]nums,int target,char flag){
        int first=0;
        int second=nums.length-1;
        int ans=-1;
        while(first<=second){
            int mid=first+(second-first)/2;
            if(nums[mid]==target){
                ans=mid;
                if(flag=='f'){
                    second=mid-1;
                }
                else if(flag=='l'){
                    first=mid+1;
                }
                
            }
            else if(nums[mid]<target){
                first=mid+1;
            }
            else{
                second=mid-1;
            }
        }
        return ans;
        
    }
    
}