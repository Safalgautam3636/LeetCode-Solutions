class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int num=n/2;
        HashMap<Integer,Integer>hash=new HashMap<>();
        if(nums.length==1){
            return nums[0];
        }
        for(int x:nums){
            if(hash.containsKey(x)){
                if(hash.get(x)+1>num){
                    return x;
                }
                hash.put(x,hash.get(x)+1);
            }
                
            else{
                hash.put(x,1);
            }
            
            
        }
        return 0;
    }
}