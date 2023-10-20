class KthLargest {
    int k;
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int x:nums){
            pq.add(x);
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        while(pq.size()>k){
            pq.poll();
        }
        
        return !pq.isEmpty()?pq.peek():-1;
    }
    
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */