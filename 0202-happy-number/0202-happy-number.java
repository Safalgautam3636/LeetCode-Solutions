class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
            if(slow==1||fast==1){
                return true;
            }
        }
        while(slow!=fast);
        return false;
    }
    public int findSquare(int num){
        int sum=0;
        while(num!=0){
            sum+=(num%10)*(num%10);
            num=num/10;
        }
        return sum;
    }
}