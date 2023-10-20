class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((o1,o2)->o2-o1);
        for(int x:stones){
            pq.offer(x);
        }
        while(pq.size()>=2){
            int first=pq.poll();
            int second=pq.poll();
            if(first-second!=0){
                pq.offer(first-second);
            }
        }
        
        return pq.isEmpty()?0:pq.poll();
    }
}