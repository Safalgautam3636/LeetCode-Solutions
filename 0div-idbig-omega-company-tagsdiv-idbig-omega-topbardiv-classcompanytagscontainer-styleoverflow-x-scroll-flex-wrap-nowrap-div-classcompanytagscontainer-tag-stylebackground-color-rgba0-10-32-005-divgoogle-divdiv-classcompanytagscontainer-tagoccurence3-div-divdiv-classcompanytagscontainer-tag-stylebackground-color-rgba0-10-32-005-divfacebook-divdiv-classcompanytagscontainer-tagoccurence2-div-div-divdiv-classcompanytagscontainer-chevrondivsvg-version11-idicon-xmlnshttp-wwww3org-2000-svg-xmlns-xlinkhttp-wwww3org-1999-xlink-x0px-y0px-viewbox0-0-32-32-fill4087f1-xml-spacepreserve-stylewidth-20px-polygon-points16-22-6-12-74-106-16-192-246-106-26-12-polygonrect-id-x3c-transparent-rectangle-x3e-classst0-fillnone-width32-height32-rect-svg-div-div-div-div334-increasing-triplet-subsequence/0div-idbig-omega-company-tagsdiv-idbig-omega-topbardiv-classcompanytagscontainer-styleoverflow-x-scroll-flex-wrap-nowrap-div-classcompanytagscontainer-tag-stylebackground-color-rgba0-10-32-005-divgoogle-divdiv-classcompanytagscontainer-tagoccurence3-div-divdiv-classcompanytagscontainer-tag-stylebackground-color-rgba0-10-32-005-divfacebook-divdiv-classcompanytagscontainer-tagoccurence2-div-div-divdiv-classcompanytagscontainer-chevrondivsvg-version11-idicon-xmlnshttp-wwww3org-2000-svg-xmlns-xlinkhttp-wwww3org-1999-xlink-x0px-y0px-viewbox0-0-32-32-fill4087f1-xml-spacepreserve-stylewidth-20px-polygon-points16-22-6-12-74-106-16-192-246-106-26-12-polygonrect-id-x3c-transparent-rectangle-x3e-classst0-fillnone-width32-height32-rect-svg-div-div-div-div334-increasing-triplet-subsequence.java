class Solution {
    public boolean increasingTriplet(int[] nums) {
        int minFirst=Integer.MAX_VALUE;
        int minSecond=Integer.MAX_VALUE;
        for(int x:nums){
            if(x<minFirst){
                minFirst=x;
            }
            else if(x>minFirst&&x<minSecond){
                minSecond=x;
            }
            else if(x>minSecond){
                return true;
            }
        }
        return false;
        
    }
}