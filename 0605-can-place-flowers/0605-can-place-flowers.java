class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        int newArr[]=new int[flowerbed.length+2];
        newArr[0]=0;
        for(int i=1;i<newArr.length-1;i++){
            newArr[i]=flowerbed[i-1];
        }
        newArr[newArr.length-1]=0;
        for(int i=1;i<newArr.length-1;i++){
            if(newArr[i-1]==0&&newArr[i]==0&&newArr[i+1]==0){
                newArr[i]=1;
                n--;
                if(n==0){
                    return true;
                }
            }
        }
        return n==0;
    }
}