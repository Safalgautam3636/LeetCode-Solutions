class Solution {
    public boolean isBipartite(int[][] graph) {
        int color[]=new int[graph.length];
        for(int i=0;i<color.length;i++)color[i]=-1;
        for(int i=0;i<color.length;i++){
            if(color[i]==-1){
                if(!check(i,graph,color)){
                    return false;
                }
            }
            
        }
        return true;
    }
    
    boolean check(int i,int[][]graph,int[]color){
        Queue<Integer>queue=new LinkedList<>();
        queue.add(i);
        color[i]=0;
        while(queue.isEmpty()==false){
            int node=queue.poll();
            for(int it:graph[node]){
                if(color[it]==-1){
                    color[it]=1-color[node];
                    queue.add(it);
                }
                else if(color[it]==color[node]){
                    return false;
                }
            }
        }
        return true;
    }
    
}