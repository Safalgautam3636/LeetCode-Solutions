class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1&&!visited[i][j]){
                    
                    ans=Math.max(ans,dfs(grid,visited,i,j));
                }
            }
        }
        
        
        return ans;
    }
    int dfs(int[][]grid,boolean [][]visited,int i,int j){
        
        
        if(i<0||j<0||i>grid.length-1||j>grid[0].length-1||visited[i][j]||grid[i][j]==0){
            return 0;
        }
//         if(i<=grid.length-1&&j<=grid[0].length-1&&i>=0&&j>=0&&!visited[i][j]&&grid[i][j]==1){
            
//             return 1;
//         }
        visited[i][j]=true;
        return 1+dfs(grid,visited,i-1,j)+dfs(grid,visited,i,j-1)+dfs(grid,visited,i+1,j)+dfs(grid,visited,i,j+1);
    }
}