class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int x:stones){
            pq.offer(x);
        }
        while(pq.size()>=2){
            int heavy=pq.poll();
            int light=pq.poll();
            if(heavy==light){
                continue;
            }
            else{
                pq.offer(heavy-light);
            }
        }
        return pq.size()>0?pq.poll():0;
    }
}