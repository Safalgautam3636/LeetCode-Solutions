class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((o1,o2)->o2-o1);
        int ans=0;
        for(int x:nums){
            pq.add(x);
            
        }
        while(k>1&&pq.size()>1){
            k--;
            pq.poll();
        }
        return pq.poll();
    }
}