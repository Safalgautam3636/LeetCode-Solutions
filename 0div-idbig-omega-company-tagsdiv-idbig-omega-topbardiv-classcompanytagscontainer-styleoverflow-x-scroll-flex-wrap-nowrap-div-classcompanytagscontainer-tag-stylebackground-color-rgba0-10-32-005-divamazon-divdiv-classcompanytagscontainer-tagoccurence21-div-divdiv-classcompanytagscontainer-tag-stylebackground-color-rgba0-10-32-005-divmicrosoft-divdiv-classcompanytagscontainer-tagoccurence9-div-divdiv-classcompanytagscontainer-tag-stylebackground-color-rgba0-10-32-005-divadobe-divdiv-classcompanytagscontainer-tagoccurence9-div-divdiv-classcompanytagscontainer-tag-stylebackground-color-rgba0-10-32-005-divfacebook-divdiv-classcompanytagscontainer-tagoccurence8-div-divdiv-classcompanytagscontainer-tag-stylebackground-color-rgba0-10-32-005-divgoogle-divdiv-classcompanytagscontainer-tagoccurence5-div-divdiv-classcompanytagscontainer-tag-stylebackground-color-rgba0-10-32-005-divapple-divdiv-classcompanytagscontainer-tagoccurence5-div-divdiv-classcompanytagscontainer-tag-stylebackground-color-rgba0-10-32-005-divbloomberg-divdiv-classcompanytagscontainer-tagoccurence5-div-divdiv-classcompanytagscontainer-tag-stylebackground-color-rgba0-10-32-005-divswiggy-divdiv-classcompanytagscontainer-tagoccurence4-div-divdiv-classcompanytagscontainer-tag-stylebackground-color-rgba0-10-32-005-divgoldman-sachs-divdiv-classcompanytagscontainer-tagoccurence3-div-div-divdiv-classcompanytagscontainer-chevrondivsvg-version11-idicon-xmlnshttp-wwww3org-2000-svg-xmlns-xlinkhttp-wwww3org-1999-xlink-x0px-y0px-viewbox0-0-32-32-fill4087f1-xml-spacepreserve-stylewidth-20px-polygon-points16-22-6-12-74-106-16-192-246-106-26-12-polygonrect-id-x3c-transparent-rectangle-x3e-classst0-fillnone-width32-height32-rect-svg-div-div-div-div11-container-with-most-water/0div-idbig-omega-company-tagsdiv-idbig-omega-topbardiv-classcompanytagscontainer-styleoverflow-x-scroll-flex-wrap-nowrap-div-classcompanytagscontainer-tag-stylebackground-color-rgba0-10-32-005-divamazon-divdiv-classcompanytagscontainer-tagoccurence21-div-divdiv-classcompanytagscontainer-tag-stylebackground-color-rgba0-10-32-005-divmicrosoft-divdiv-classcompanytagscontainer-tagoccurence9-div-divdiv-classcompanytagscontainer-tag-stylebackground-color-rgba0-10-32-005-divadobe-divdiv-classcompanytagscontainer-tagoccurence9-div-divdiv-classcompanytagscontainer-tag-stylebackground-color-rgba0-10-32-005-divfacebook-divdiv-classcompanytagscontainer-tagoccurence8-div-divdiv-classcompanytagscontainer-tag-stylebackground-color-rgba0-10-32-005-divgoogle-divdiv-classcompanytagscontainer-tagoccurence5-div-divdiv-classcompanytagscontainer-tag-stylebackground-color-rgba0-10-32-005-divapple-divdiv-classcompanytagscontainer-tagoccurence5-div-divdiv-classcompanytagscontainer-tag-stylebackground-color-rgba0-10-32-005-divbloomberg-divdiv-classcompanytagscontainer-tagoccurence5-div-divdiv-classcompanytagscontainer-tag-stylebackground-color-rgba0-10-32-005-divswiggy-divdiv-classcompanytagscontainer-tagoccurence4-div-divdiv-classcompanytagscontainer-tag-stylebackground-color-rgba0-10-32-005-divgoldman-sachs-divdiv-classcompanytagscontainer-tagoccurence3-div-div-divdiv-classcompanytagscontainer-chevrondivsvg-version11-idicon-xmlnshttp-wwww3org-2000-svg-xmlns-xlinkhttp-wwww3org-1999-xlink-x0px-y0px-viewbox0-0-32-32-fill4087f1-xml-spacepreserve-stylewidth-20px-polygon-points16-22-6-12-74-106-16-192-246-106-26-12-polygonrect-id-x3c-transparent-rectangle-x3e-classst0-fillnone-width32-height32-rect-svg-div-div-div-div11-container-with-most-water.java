class Solution {
    public int maxArea(int[] height) {
        int maxArea=Integer.MIN_VALUE;
        int first=0;
        int second=height.length-1;
        while(first<second){
            int minCurrent=Math.min(height[first],height[second]);
            maxArea=Math.max(maxArea,minCurrent*(second-first));
            if(height[first]<height[second]){
                first++;
            }
            else{
                second--;
            }
            
        }
        return maxArea;
    }
}