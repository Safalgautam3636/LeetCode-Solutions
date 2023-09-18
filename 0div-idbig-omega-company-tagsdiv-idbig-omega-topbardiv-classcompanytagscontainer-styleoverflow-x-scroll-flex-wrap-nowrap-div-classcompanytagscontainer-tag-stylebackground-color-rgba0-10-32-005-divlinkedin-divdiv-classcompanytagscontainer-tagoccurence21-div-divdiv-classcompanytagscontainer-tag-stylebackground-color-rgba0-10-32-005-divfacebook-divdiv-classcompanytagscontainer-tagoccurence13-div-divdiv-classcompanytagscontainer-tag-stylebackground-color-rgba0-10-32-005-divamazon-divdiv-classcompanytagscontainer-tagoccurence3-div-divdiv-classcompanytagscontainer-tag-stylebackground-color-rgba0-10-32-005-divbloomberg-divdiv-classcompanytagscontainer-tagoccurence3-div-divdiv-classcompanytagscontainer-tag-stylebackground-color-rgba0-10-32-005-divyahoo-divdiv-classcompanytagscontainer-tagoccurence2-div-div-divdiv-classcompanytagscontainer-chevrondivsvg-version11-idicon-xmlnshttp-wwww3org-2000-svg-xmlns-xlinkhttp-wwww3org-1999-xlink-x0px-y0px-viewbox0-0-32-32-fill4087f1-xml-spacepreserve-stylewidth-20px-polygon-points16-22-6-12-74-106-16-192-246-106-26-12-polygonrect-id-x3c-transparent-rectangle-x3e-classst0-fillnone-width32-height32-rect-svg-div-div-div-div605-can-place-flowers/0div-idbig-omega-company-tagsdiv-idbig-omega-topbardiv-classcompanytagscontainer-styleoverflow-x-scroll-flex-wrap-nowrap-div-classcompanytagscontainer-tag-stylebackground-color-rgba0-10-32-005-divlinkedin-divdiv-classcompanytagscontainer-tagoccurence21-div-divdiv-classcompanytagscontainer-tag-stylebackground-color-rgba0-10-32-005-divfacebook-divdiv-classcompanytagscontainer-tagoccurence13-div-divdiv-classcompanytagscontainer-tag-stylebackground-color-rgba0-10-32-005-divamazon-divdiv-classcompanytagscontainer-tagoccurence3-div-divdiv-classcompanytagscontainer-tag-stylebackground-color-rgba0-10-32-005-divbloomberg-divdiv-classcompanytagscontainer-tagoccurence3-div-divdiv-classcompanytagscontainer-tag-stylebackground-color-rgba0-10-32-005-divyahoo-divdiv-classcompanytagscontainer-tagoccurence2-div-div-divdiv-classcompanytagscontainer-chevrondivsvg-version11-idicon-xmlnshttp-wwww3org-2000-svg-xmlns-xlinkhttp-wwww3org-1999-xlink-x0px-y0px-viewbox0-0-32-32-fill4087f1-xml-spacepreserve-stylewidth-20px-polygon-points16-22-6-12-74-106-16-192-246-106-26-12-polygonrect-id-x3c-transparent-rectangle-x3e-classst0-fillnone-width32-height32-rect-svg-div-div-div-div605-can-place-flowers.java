class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int newArr[]=new int[flowerbed.length+2];
        newArr[0]=0;
        newArr[newArr.length-1]=0;
        for(int i=1;i<flowerbed.length+1;i++){
            newArr[i]=flowerbed[i-1];
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
         System.out.println(" ");
        for(int i=1;i<newArr.length-1;i++){
            if(newArr[i-1]==0&&newArr[i]==0&&newArr[i+1]==0){
                n--;
                newArr[i]+=1;
            }
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
        if(n<=0){
            return true;
        }
        return false;
    }
}