class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        int visited[]=new int[n];
        int pathVis[]=new int[n];
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>temp=new ArrayList<>();
            for(int j=0;j<graph[i].length;j++){
                temp.add(graph[i][j]);
            }
            adj.add(temp);
        }
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                dfs(adj,visited,pathVis,i);
            }
        }
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(pathVis[i]==0){
                ans.add(i);
            }
        }
        return ans;
    }
    private boolean dfs(List<List<Integer>>adj,int[]visited,int[]pathVis,int i){
        visited[i]=1;
        pathVis[i]=1;
        for(int ele:adj.get(i)){
            if(visited[ele]==0){
                if(dfs(adj,visited,pathVis,ele)){
                    return true; 
                }
            }
            else if(pathVis[ele]==1){
                return true;
            }
        }
        pathVis[i]=0;
        return false;
    }
}