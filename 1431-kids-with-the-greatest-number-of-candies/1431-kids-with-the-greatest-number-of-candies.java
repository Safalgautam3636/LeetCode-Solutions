class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int x:candies){
            if(x<min){
                min=x;
            }
            if(x>max){
                max=x;
            }
        }
        for(int i=0;i<candies.length;i++){
            int added=candies[i]+extraCandies;
            if(added>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}