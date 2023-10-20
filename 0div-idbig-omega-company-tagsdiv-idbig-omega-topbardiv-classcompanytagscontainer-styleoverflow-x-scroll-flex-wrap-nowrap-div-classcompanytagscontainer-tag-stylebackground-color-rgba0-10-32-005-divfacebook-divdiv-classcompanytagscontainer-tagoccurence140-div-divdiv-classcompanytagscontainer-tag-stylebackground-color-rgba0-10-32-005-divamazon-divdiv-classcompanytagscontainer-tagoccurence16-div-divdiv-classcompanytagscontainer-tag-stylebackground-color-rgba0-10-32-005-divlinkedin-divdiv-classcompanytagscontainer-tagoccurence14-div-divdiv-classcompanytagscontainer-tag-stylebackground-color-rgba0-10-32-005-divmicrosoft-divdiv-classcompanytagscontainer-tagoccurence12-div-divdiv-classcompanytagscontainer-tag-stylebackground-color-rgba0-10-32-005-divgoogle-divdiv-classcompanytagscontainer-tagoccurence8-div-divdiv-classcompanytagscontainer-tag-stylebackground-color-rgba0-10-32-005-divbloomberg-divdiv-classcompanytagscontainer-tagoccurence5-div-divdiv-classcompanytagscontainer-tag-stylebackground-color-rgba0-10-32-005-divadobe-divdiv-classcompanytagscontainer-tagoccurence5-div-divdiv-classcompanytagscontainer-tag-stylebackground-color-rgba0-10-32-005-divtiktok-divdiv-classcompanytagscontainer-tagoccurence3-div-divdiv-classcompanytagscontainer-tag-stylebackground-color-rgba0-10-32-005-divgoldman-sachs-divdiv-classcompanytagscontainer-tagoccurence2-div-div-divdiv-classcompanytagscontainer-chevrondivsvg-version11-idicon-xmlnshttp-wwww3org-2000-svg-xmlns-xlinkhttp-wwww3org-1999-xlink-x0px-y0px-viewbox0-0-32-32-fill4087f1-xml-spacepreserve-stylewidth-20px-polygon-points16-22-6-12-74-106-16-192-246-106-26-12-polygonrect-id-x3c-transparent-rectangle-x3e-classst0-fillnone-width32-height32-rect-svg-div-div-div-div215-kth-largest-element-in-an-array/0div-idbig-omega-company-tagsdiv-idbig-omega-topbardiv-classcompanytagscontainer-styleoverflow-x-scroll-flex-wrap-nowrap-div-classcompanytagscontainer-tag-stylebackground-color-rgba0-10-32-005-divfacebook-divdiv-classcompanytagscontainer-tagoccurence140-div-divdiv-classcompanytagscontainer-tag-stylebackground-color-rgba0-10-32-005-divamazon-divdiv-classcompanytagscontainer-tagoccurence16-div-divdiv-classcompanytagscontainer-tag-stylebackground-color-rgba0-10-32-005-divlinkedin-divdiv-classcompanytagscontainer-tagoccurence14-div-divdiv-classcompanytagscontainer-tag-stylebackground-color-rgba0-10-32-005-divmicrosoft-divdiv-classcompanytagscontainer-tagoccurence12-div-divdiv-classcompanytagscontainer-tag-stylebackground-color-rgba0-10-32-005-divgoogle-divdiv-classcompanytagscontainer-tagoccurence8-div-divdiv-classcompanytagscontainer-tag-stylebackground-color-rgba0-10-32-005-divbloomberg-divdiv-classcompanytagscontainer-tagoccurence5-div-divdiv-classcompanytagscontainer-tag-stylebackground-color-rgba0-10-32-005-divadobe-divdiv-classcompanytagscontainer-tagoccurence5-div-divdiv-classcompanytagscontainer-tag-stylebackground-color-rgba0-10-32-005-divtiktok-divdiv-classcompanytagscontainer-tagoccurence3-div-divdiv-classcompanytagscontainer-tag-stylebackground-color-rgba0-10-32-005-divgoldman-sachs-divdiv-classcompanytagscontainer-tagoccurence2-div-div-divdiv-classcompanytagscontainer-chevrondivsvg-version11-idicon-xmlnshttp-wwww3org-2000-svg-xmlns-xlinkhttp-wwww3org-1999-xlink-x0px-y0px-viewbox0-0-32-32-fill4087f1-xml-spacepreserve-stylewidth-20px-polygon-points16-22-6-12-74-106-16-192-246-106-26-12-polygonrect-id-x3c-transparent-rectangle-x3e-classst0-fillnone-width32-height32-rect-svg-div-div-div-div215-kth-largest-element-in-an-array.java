class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((o1,o2)->o2-o1);
        for(int x:nums){
            pq.add(x);
        }
        int ans=0;
        while(k>0){
            ans=pq.poll();
            k--;
        }
        return ans;
    }
}