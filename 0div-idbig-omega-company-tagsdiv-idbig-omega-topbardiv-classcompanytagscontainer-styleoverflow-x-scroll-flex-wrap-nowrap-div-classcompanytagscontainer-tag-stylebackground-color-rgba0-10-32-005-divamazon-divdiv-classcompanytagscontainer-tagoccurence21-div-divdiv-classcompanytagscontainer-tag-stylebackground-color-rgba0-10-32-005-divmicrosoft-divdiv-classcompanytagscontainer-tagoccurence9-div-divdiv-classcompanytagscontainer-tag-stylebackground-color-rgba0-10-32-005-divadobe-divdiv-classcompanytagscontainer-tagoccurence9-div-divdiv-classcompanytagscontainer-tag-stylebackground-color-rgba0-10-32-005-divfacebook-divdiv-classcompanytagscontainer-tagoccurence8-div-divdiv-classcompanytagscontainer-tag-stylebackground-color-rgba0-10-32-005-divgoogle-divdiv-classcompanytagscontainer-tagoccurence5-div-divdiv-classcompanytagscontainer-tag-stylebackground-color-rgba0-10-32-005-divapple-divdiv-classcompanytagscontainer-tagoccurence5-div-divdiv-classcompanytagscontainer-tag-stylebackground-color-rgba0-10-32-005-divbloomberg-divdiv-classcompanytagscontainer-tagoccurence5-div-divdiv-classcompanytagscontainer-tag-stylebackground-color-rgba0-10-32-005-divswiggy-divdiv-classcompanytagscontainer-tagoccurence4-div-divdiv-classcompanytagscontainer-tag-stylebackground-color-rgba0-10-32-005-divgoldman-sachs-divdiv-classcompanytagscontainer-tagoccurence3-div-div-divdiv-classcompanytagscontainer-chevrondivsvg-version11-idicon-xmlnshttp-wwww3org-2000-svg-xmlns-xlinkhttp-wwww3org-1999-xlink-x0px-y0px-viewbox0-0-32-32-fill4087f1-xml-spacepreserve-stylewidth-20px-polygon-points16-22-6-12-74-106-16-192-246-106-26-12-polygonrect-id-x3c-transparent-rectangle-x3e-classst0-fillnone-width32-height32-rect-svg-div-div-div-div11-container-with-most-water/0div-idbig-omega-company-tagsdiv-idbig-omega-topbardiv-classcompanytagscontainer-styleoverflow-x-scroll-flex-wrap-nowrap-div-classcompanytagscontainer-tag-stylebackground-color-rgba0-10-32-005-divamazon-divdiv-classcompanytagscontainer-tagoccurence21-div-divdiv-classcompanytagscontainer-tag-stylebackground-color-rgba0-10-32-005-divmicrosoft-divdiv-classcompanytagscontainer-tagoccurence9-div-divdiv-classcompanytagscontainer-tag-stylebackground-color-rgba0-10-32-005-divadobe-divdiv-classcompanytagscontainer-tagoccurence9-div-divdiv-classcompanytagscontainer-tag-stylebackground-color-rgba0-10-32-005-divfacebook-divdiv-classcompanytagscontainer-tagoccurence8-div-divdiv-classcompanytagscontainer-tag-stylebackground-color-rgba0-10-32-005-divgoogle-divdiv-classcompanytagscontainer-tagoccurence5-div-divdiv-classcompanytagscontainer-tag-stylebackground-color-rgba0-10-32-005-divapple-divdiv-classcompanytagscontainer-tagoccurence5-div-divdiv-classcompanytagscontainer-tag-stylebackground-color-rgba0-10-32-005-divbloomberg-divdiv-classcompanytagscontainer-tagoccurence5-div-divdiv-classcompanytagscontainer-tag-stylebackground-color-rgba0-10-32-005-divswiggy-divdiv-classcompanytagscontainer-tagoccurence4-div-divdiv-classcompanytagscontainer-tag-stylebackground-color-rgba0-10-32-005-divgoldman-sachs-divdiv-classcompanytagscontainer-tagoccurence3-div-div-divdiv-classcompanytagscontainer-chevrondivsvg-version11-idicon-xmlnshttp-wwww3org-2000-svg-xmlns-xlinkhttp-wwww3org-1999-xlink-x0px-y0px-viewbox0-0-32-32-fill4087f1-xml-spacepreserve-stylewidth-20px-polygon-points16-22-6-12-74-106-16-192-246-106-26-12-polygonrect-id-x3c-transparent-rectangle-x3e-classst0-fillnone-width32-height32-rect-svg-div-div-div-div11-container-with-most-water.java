class Solution {
    public int maxArea(int[] height) {
        int waterHolder=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int maxArea=Math.min(height[left],height[right])*(right-left);
            waterHolder=Math.max(maxArea,waterHolder);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
            
        }
        return waterHolder;
    }
}