class Solution {
    public boolean exist(char[][] board, String word) {
        
        char first=word.charAt(0);
        boolean visited[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(first==board[i][j]){
                    if (backtrack(board,i,j,word,visited,0)){
                        return true;
                    }
                }
                
                
            }
        }
        return false;
        
    }
    boolean backtrack(char[][]board,int i,int j,String word,boolean visited[][],int index){
        if(index==word.length())
            return true;
        if(i<0||j<0||i>board.length-1||j>board[0].length-1||visited[i][j]){
            return false;
        }
        if(board[i][j]!=word.charAt(index)){
            return false;
        }
        
        visited[i][j]=true;
        boolean store=backtrack(board,i,j+1,word,visited,index+1)|
                        backtrack(board,i,j-1,word,visited,index+1)|
                        backtrack(board,i-1,j,word,visited,index+1)|
                        backtrack(board,i+1,j,word,visited,index+1);
        if(store){
            return true;
        }
        visited[i][j]=false;
        return false;
        
        
        
    }
}