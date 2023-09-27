class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            //area=l*h
            int h=Math.min(height[left],height[right]);
            int l=right-left;
            maxArea=Math.max(maxArea,h*l);
            if(height[left]==height[right]){
                left++;
            }
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}