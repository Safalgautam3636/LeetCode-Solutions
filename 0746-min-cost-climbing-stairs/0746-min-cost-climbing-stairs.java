class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int costnew[]=new int[cost.length+1];
        for(int i=0;i<cost.length;i++){
            costnew[i]=cost[i];
        }
        for(int i=costnew.length-3;i>=0;i--){
            costnew[i]+=Math.min(costnew[i+1],costnew[i+2]);
            System.out.println(costnew[i]+" "+i);
        }
        return (int)Math.min(costnew[0],costnew[1]);
    }
}