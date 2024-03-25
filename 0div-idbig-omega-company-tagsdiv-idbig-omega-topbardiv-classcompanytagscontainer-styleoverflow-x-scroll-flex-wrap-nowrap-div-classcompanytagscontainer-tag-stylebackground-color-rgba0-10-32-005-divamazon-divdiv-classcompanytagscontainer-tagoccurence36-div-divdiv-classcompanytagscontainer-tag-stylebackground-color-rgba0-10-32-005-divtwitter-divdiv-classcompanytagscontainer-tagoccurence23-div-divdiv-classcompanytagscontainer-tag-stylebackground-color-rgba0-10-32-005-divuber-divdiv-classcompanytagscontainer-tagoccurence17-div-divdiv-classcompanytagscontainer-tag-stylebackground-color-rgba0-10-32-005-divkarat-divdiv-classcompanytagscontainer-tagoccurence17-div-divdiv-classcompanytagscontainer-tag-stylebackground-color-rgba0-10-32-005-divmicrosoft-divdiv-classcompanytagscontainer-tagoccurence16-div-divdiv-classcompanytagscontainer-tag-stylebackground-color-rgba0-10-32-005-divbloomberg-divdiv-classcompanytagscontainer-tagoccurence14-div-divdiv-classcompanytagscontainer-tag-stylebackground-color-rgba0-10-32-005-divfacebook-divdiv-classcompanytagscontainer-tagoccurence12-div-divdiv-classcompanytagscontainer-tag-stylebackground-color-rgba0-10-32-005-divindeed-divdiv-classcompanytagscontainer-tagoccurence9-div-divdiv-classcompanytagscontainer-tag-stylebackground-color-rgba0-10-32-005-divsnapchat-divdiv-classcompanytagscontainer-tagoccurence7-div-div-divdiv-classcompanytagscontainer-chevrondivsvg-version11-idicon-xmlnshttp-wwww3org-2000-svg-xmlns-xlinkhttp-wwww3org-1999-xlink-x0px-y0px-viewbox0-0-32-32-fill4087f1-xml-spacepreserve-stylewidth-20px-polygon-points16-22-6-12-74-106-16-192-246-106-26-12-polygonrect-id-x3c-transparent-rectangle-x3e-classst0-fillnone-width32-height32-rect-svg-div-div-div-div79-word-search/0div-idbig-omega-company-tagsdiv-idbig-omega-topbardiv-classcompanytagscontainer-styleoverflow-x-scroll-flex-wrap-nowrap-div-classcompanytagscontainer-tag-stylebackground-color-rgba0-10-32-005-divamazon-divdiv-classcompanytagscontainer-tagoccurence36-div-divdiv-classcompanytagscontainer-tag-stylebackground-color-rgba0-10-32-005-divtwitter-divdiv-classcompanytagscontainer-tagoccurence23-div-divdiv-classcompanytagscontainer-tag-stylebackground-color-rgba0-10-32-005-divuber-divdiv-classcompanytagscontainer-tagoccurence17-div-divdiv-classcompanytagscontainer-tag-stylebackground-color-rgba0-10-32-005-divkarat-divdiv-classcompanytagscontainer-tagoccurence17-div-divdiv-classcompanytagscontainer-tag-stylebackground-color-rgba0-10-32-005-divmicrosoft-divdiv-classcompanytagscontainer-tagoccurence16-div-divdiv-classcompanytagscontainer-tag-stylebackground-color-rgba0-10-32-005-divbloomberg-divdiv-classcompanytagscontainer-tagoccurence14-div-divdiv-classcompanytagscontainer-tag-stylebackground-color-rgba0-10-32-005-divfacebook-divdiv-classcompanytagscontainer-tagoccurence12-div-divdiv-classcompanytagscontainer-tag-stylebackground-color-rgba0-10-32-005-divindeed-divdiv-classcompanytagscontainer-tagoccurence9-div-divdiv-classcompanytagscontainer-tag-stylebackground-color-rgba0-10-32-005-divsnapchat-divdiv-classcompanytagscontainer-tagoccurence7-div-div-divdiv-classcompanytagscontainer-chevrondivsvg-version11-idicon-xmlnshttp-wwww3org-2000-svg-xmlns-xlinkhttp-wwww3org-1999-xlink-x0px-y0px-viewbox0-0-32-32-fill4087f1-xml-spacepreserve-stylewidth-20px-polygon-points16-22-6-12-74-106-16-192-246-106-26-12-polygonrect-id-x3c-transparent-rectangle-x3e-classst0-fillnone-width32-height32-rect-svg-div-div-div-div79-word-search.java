class Solution {
    public boolean exist(char[][] board, String word) {
      
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(dfs(board,word,new HashSet<String>(),0,i,j,row,col))return true;
                
            }
        }
        return false;
        
        
    }
    boolean dfs(char[][]board,String word,HashSet<String>hash,int index,int i,int j,int row,int col){
        if(index==word.length()){
            return true;
        }
        if(j<0||i<0||i>=row||j>=col||hash.contains(i+" "+j)||board[i][j]!=word.charAt(index))
            return false;
        
        hash.add(i+" "+j);
        boolean ans=dfs(board, word,hash,index+1,i-1,j,row,col)||
        dfs(board, word,hash,index+1,i+1,j,row,col)||
        dfs(board, word,hash,index+1,i,j-1,row,col)||
        dfs(board, word,hash,index+1,i,j+1,row,col);
        hash.remove(i+" "+j);
        return ans;
    }
}