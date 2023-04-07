class Solution {
    public int numEnclaves(int[][] grid) {
        // boolean visited[][]=new boolean[grid.length][grid[0].length];
        int ans=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if((i==0||j==0||i==row-1||j==col-1)&&grid[i][j]==1){
                    dfs(grid,row,col,i,j);
                }
            }
        }
        return summer(grid);
    }
    int summer(int[][]grid){
        int sum=0;
        for(int x[]:grid){
            for(int y:x){
                sum+=y;
            }
        }
        return sum;
    }
    void dfs(int[][]grid,int row,int col,int i,int j){
        if(i>row-1||i<0||j>col-1||j<0||grid[i][j]==0){
            return;
        }
        grid[i][j]=0;
        // visited[i][j]=true;
        dfs(grid,row,col,i+1,j);
        dfs(grid,row,col,i-1,j);
        dfs(grid,row,col,i,j+1);
        dfs(grid,row,col,i,j-1);
        
        
    }
}