class Solution {
    public int largestAltitude(int[] gain) {
        int newArr[]=new int[gain.length+1];
        newArr[0]=0;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<newArr.length;i++){
            newArr[i]=newArr[i-1]+gain[i-1];
            max=Math.max(max,newArr[i]);
            
        }
        if(max<0){
            return 0;
        }
        return max;
        
    }
}