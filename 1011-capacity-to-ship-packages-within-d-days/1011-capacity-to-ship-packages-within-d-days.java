class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=-1;
        int end=0;
        for(int x:weights){
            end+=x;
            start=Math.max(x,start);
        }
        
        int result=end;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(canAcomodate(mid,days,weights)){
                result=Math.min(result,mid);
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        return result;
    }
    boolean canAcomodate(int mid,int days,int[]weights){
        int counter=1;
        int summer=mid;
        for(int i=0;i<weights.length;i++){
            if(summer-weights[i]<0)
            {
                counter++;
                summer=mid;
            }
            summer-=weights[i];
            
        }
        return counter<=days;
    }
}