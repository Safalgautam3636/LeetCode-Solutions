class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix[]=new int[nums.length];
        int sufix[]=new int[nums.length];
        int ans[]=new int[nums.length];
        prefix[0]=nums[0];
        sufix[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]*nums[i];
        }
        for(int i=sufix.length-1;i>0;i--){
            sufix[i-1]=sufix[i]*nums[i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                System.out.println(i);
                ans[i]=sufix[i+1];
            }
            if(i==sufix.length-1){
                ans[i]=prefix[i-1];
            }
            else{
                if(i!=0 && i!=sufix.length-1){
                    ans[i]=(prefix[i-1])*(sufix[i+1]);
                }
                
            }
            
        }
        return ans;
    }
    
}