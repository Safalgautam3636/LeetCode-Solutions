class Solution {
    boolean dfs(boolean visited[],boolean pathVisited[],int i,List<List<Integer>>adj){
        visited[i]=true;
        pathVisited[i]=true;
        for(int n:adj.get(i)){
            if(!visited[n]){
                if(dfs(visited,pathVisited,n,adj))return true;
            }
            else if(pathVisited[n]){
                return true;
            }
        }
        pathVisited[i]=false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList());
        }
        for(int[] p:prerequisites){
            adj.get(p[0]).add(p[1]);
        }
        boolean visited[]=new boolean[numCourses];
        boolean pathVisited[]=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(dfs(visited,pathVisited,i,adj)){
                    return false;
                }
            }
        }
        return true;
    }
}
