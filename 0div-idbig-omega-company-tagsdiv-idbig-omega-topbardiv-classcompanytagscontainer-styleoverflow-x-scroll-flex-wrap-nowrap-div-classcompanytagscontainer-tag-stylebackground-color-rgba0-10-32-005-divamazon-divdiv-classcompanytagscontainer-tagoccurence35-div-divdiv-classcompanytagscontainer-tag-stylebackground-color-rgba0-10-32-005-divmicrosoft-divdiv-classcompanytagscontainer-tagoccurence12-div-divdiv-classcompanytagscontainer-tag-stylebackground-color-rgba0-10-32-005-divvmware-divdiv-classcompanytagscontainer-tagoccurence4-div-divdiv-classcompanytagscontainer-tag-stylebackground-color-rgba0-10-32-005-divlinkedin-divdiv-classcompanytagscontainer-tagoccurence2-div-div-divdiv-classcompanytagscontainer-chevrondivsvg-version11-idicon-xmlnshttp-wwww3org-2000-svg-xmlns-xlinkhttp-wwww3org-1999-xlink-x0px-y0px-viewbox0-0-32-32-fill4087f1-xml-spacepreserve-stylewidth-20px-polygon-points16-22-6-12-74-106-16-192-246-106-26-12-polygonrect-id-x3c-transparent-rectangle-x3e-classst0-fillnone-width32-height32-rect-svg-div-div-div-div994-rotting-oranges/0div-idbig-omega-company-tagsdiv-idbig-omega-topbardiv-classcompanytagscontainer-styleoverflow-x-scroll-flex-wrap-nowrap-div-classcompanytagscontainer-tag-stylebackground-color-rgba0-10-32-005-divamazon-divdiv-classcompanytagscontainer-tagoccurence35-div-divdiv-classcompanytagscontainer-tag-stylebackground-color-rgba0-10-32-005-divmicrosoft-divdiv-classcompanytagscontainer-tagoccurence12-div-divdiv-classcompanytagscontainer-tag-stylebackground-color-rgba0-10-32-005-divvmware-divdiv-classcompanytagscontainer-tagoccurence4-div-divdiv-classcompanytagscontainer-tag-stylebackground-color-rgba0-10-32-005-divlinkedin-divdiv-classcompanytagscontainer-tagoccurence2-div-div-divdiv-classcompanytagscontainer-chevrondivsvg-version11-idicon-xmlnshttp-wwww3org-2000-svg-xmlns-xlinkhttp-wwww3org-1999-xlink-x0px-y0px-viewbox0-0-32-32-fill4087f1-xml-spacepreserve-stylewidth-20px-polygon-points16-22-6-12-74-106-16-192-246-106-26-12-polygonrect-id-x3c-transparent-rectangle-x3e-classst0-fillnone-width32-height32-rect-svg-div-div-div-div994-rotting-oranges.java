class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int fresh=0;
        boolean visited[][]=new boolean[row][col];
        Queue<Pair>queue=new LinkedList<>();
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    fresh++;
                }
                else if(grid[i][j]==2){
                    queue.offer(new Pair(i,j));
                }
            }
        }
        int ans=0;
        while(!queue.isEmpty()&&fresh>0){
            int size=queue.size();
            ans++;
            for(int i=0;i<size;i++){
                Pair element=queue.poll();
                int r=element.row;
                int c=element.col;
                if(r-1>=0&&grid[r-1][c]==1&&!visited[r-1][c]){
                    fresh--;
                    visited[r-1][c]=true;
                    queue.offer(new Pair(r-1,c));
                }
                if(r+1<=row-1&&grid[r+1][c]==1&&!visited[r+1][c]){
                    fresh--;
                    visited[r+1][c]=true;
                    queue.offer(new Pair(r+1,c));
                }
                if(c-1>=0&&grid[r][c-1]==1&&!visited[r][c-1]){
                    fresh--;
                    visited[r][c-1]=true;
                    queue.offer(new Pair(r,c-1));
                }
                if(c+1<=col-1&&grid[r][c+1]==1&&!visited[r][c+1]){
                    fresh--;
                    visited[r][c+1]=true;
                    queue.offer(new Pair(r,c+1));
                }
            }
            
        }
        return fresh==0?ans:-1;
        
    }
}