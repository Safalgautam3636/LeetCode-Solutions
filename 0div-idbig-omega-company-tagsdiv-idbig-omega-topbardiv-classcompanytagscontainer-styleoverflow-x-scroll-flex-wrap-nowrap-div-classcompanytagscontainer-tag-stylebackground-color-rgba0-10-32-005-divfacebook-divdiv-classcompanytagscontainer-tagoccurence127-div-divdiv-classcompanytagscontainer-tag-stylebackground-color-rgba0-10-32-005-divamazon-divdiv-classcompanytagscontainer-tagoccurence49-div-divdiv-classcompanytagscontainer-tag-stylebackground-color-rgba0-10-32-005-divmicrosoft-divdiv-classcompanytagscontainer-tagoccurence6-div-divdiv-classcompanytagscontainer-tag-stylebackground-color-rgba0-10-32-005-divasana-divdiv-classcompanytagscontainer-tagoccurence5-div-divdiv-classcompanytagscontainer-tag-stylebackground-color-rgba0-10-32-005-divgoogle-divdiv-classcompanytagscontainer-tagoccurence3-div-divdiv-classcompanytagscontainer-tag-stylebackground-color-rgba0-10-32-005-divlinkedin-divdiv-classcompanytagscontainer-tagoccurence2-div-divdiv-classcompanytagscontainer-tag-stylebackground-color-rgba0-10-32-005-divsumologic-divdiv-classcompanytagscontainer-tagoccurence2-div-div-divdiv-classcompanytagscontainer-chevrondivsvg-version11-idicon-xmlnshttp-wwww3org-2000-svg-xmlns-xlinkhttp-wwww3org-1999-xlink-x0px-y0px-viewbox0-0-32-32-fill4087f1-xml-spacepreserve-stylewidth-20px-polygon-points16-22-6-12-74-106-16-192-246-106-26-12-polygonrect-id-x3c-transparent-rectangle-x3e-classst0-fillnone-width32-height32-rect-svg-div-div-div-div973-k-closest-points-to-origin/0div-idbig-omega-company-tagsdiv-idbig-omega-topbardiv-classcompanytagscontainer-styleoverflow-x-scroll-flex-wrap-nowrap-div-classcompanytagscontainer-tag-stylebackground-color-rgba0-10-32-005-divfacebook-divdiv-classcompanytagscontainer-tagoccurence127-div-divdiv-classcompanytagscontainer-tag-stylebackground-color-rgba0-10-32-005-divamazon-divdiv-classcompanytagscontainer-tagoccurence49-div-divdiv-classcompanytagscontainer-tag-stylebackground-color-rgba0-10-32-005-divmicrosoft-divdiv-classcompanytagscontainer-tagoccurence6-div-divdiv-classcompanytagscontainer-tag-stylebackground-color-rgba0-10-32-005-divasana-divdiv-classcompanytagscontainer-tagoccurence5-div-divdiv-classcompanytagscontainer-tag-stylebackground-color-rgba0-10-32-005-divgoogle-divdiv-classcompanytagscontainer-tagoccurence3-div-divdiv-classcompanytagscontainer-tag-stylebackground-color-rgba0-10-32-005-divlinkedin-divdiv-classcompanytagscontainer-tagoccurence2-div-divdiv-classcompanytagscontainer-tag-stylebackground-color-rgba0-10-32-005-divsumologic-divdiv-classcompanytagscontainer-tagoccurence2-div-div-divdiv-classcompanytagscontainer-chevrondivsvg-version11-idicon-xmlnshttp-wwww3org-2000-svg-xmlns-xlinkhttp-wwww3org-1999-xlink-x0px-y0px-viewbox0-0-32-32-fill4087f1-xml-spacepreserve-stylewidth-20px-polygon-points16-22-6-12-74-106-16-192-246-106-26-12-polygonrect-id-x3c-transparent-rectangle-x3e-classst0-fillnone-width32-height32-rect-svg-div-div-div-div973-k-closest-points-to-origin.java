class Node{
    int x;
    int y;
    int distance;
    Node(int x,int y){
        this.x=x;
        this.y=y;
        this.distance=x*x+y*y;
    }
}
class Solution {
    
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Node>pq=new PriorityQueue<>((o1,o2)->o1.distance-o2.distance);
        for(int[]point: points){
            pq.offer(new Node(point[0],point[1]));
            
        }
        int[][]ans=new int[k][2];
        int ptr=0;
        while(ptr!=k&&pq.size()>0){
            Node pol=pq.poll();
            int temp[]={pol.x,pol.y};
            ans[ptr]=temp;
            ptr++;
        }
        
        return ans;
    }
}