class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((x,y)->(x[0]*x[0]+x[1]*x[1])-(y[0]*y[0]+y[1]*y[1]));
        for(int x[]:points){
            pq.offer(x);
        }
        int ans[][]=new int[k][2];
        
        while(k>=1&&pq.size()>0){
            ans[k-1]=pq.poll();
            k--;
        }
        return ans;
    }
}