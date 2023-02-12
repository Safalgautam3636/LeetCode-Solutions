class Solution {
    public int totalNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        String board[][]=new String[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]=".";
            }
        }
        Set<Integer>col=new HashSet<>();
        Set<Integer>r=new HashSet<>();
        Set<Integer>l=new HashSet<>();
        dfs(board,ans,col,0,new ArrayList(),r,l);
        return ans.size();
    }
     void dfs(String[][]board,List<List<String>>ans,Set<Integer>col,int n,List<String>store,Set<Integer>diagonalleft,Set<Integer>diagonalright){
        if(n==board.length){
            String temp="";
            for(int i=0;i<board.length;i++){
                temp = "";
                for(int j=0;j<board[0].length;j++){
                    temp+=board[i][j]+"";
                }
                store.add(temp);
            }
            ans.add(new ArrayList(store));
        }

        for(int i=0;i<board.length;i++){
            if(!col.contains(i)&&!diagonalleft.contains(n-i)&&!diagonalright.contains(n+i)){
                board[n][i]="Q";
                col.add(i);
                diagonalleft.add(n-i);
                diagonalright.add(n+i);
                dfs(board,ans,col,n+1,new ArrayList(),diagonalleft,diagonalright);
                board[n][i]=".";
                col.remove(i);
                diagonalleft.remove(n-i);
                diagonalright.remove(n+i);
                
            }
        }
    }
}