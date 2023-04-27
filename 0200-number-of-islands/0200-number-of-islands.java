class Solution {
    private void dfs(char[][] grid,boolean [][]visited,int i,int j){
        // if(visited[i][j]&&i<0&&j<0&&j>=visited[0].length&&i>=visited.length){
        //     return;
        // }
        if(i>=0&&i<=grid.length-1&&j>=0&&j<=grid[0].length-1&&!visited[i][j]&&grid[i][j]=='1'){
            visited[i][j]=true;
            
            dfs(grid,visited,i+1,j);
            dfs(grid,visited,i,j+1);
            dfs(grid,visited,i-1,j);
            dfs(grid,visited,i,j-1);
        }
        
    }
    public int numIslands(char[][] grid) {
        int ans=0;
        boolean [][]visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'&&!visited[i][j]){
                    ans++;
                    dfs(grid,visited,i,j);
                }
            }
        }
        
        return ans;
    }
}