class Solution {
    public int[] sortArray(int[] nums) {
        int ans[]=new int[nums.length];
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int x:nums){
            pq.add(x);
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=pq.remove();
        }
        return ans;
    }
}