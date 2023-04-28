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
        //0 => empty cell
        //1 => fresh orange
        //2 => rotten oranges
        int ROW=grid.length;
        int COL=grid[0].length;
        Queue<Pair>queue=new LinkedList<>();
        int fresh=0;
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    fresh++;
                }
                if(grid[i][j]==2){
                    queue.offer(new Pair(i,j));
                }
            }
        }
        while(!queue.isEmpty()&&fresh>0){
            int size=queue.size();
            ans++;
            for(int i=0;i<size;i++){
                Pair element=queue.poll();
                int row=element.row;
                int col=element.col;
                if(row>=0&&col>=0&&row<=ROW-1&&col<=COL-1){
                    if(row-1>=0&&grid[row-1][col]==1){
                        grid[row-1][col]=2;
                        queue.offer(new Pair(row-1,col));
                        fresh--;
                    }
                    if( row+1<=ROW-1&&grid[row+1][col]==1){
                         grid[row+1][col]=2;
                        queue.offer(new Pair(row+1,col));
                        fresh--;
                    }
                    if(col-1>=0&&grid[row][col-1]==1){
                        grid[row][col-1]=2;
                        queue.offer(new Pair(row,col-1));
                        fresh--;
                    }
                    if(col+1<=COL-1&&grid[row][col+1]==1){
                        grid[row][col+1]=2;
                        queue.offer(new Pair(row,col+1));
                        fresh--;
                    }
                }
            }
        }
        return fresh==0?ans:-1;
    }
}