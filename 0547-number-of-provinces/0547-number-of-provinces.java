class Solution {
    private void dfs(int[][] isConnected,boolean visited[],int i){
        visited[i]=true;
        for(int j=0;j<isConnected[i].length;j++){
            if(!visited[j]&&isConnected[i][j]==1){
                dfs(isConnected,visited,j);
            }
        }
        
    }
    public int findCircleNum(int[][] isConnected) {
        boolean visited[]=new boolean[isConnected.length];
        int ctr=0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                ctr++;
                dfs(isConnected,visited,i);
            }
        }
        return ctr;
    }
}