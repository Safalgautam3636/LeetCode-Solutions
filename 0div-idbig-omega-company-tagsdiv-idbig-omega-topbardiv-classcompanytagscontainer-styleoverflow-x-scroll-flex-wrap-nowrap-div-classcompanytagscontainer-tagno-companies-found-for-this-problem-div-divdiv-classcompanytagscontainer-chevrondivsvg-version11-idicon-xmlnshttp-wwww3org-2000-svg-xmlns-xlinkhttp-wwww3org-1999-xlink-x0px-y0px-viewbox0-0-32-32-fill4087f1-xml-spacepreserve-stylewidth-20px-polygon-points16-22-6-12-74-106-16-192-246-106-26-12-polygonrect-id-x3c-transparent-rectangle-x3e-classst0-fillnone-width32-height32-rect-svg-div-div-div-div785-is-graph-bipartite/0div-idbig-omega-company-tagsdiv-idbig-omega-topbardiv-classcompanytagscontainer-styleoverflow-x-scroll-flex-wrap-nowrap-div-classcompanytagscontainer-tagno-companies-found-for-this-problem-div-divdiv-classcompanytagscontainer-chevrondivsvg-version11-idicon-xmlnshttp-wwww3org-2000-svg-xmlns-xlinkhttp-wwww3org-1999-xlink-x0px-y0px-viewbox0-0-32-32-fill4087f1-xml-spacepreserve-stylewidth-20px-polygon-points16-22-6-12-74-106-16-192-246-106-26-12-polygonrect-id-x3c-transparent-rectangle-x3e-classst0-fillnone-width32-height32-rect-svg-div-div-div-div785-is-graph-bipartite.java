class Solution {
    public boolean isBipartite(int[][] graph) {
        int color[]=new int[graph.length];
        for(int i=0;i<color.length;i++)color[i]=-1;
        for(int i=0;i<color.length;i++){
            if(color[i]==-1){
                if(!check(i,graph,0,color)){
                    return false;
                }
            }
            
        }
        return true;
    }
    
    boolean check(int node,int[][]graph,int mark,int[]color){
        
            color[node]=mark;
            for(int it:graph[node]){
                if(color[it]==-1){
                    if(!check(it,graph,1-mark,color))return false;
                }
                else if(color[it]==color[node]){
                    return false;
                }
            }
       
        return true;
    }
    
}