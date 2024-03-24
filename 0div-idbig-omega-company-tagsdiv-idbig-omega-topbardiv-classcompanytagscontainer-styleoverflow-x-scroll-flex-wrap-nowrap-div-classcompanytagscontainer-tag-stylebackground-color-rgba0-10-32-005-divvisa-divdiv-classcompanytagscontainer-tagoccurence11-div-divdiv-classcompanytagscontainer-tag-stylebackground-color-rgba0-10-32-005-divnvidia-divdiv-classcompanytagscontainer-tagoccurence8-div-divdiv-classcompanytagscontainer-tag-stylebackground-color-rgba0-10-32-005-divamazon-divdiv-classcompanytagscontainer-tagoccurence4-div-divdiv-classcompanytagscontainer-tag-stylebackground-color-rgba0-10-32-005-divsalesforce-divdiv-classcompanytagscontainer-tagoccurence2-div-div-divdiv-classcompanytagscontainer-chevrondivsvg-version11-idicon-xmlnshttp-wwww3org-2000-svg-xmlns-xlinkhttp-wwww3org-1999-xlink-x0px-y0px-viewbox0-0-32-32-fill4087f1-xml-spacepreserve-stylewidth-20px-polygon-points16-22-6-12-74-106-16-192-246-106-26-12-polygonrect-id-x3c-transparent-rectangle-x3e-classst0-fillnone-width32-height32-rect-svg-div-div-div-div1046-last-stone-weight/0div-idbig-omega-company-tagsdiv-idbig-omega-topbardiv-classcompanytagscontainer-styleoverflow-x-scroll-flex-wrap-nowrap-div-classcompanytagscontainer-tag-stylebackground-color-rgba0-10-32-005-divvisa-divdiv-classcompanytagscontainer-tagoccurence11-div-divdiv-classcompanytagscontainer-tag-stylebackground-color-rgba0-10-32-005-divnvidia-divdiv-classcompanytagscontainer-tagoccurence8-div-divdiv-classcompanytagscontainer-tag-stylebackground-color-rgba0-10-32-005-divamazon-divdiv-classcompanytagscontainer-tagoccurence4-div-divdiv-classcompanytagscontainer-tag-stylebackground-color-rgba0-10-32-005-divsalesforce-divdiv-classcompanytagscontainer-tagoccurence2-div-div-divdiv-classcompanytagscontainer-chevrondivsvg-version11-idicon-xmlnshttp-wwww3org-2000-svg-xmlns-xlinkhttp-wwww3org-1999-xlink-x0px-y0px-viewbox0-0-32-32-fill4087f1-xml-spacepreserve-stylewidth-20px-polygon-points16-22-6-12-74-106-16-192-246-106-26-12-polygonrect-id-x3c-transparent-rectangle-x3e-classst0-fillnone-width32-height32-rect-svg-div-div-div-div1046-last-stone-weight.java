class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer>queue=new PriorityQueue<>((o1,o2)->o2-o1);
        //PriorityQueue<Integer>pq=new PriorityQueue<>((o1,o2)->o2-o1);
        for(int stone:stones){
            queue.add(stone);
        }
        
        while(queue.size()>1)
        {
            int first=queue.poll();
            int second=queue.poll();
            if(first-second>0){
                queue.add(first-second);
            }
        } 
        
        return queue.size()==0?0:queue.poll();
    }
}