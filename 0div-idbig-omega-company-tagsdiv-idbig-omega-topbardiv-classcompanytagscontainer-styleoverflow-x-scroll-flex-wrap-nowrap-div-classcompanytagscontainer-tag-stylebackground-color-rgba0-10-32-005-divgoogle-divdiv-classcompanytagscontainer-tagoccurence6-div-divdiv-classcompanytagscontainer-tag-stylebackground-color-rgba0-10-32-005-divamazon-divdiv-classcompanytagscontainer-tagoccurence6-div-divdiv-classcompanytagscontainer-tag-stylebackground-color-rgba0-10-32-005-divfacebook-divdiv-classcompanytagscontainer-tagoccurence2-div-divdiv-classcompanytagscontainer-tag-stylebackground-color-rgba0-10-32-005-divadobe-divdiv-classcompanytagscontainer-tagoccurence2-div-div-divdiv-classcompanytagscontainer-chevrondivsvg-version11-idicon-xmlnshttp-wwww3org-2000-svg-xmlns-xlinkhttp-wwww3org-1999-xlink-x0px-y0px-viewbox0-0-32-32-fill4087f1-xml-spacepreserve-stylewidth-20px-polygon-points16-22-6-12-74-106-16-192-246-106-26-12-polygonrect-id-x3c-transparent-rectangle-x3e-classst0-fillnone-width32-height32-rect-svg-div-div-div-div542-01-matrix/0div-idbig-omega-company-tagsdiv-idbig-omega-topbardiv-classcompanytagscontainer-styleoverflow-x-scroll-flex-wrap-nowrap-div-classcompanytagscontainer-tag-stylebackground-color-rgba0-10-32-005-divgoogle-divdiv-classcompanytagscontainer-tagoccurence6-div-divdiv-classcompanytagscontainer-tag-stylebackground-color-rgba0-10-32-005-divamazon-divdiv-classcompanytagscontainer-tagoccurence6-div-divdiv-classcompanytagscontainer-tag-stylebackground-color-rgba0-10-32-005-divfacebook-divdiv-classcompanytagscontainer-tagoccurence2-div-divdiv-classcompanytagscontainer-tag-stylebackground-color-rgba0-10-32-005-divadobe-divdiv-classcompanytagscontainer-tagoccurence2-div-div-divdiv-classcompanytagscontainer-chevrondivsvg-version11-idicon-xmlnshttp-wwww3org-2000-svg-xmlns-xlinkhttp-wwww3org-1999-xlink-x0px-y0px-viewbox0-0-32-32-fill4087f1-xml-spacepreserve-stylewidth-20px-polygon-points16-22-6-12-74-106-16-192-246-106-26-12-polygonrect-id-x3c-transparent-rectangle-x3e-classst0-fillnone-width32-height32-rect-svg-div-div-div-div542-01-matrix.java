class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[][]ans=new int[m][n];
        Queue<int[]>queue=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=mat[i][j];
                if(mat[i][j]==0){
                    int arr[]=new int[]{i,j};
                    queue.offer(arr);
                }
            }
        }
        int size=1;
        while(queue.isEmpty()==false){
            int len=queue.size();
            
            
            for(int k=0;k<len;k++){
                int[]pop=queue.peek();
                queue.poll();
                int row=pop[0];
                int col=pop[1];
                int cell=mat[row][col];
                if(cell==0){
                    if(row-1>=0&&mat[row-1][col]==1){
                        queue.add(new int[]{row-1,col});
                        mat[row-1][col]=0;
                        ans[row-1][col]=size;
                        
                    }
                    if(col-1>=0&&mat[row][col-1]==1){
                        queue.add(new int[]{row,col-1});
                        mat[row][col-1]=0;
                        ans[row][col-1]=size;
                    }
                    if(row+1<m&&mat[row+1][col]==1){
                        queue.add(new int[]{row+1,col});
                        mat[row+1][col]=0;
                        ans[row+1][col]=size;
                    }
                    if(col+1<n&&mat[row][col+1]==1){
                        queue.add(new int[]{row,col+1});
                        mat[row][col+1]=0;
                        ans[row][col+1]=size;
                    }
                }
                
                
            }
            size++;
        }
        return ans;
    }
}