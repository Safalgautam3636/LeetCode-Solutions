class Node implements Comparable<Node>{
    int distance;
    int left;
    int right;
    Node(int left,int right){
        this.distance=left*left+right*right;
        this.left=left;
        this.right=right;
    }
    public String toString(){
        return left+""+right+" ->"+distance;
    }
    public int compareTo(Node a){
        if(this.distance==a.distance){
            return 0;
        }
        if(this.distance>a.distance){
            return 1;
        }
        else{
            return -1;
        }
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Node>pq=new PriorityQueue<>();
        for(int x[]:points){
            pq.offer(new Node(x[0],x[1]));
        }
        
        int ans[][]=new int[k][2];
        
        while(k>=1&&pq.size()>0){
            Node poll=pq.poll();
            int[]arr={poll.left,poll.right};
            ans[k-1]=arr;
            k--;
        }
        return ans;
    }
}