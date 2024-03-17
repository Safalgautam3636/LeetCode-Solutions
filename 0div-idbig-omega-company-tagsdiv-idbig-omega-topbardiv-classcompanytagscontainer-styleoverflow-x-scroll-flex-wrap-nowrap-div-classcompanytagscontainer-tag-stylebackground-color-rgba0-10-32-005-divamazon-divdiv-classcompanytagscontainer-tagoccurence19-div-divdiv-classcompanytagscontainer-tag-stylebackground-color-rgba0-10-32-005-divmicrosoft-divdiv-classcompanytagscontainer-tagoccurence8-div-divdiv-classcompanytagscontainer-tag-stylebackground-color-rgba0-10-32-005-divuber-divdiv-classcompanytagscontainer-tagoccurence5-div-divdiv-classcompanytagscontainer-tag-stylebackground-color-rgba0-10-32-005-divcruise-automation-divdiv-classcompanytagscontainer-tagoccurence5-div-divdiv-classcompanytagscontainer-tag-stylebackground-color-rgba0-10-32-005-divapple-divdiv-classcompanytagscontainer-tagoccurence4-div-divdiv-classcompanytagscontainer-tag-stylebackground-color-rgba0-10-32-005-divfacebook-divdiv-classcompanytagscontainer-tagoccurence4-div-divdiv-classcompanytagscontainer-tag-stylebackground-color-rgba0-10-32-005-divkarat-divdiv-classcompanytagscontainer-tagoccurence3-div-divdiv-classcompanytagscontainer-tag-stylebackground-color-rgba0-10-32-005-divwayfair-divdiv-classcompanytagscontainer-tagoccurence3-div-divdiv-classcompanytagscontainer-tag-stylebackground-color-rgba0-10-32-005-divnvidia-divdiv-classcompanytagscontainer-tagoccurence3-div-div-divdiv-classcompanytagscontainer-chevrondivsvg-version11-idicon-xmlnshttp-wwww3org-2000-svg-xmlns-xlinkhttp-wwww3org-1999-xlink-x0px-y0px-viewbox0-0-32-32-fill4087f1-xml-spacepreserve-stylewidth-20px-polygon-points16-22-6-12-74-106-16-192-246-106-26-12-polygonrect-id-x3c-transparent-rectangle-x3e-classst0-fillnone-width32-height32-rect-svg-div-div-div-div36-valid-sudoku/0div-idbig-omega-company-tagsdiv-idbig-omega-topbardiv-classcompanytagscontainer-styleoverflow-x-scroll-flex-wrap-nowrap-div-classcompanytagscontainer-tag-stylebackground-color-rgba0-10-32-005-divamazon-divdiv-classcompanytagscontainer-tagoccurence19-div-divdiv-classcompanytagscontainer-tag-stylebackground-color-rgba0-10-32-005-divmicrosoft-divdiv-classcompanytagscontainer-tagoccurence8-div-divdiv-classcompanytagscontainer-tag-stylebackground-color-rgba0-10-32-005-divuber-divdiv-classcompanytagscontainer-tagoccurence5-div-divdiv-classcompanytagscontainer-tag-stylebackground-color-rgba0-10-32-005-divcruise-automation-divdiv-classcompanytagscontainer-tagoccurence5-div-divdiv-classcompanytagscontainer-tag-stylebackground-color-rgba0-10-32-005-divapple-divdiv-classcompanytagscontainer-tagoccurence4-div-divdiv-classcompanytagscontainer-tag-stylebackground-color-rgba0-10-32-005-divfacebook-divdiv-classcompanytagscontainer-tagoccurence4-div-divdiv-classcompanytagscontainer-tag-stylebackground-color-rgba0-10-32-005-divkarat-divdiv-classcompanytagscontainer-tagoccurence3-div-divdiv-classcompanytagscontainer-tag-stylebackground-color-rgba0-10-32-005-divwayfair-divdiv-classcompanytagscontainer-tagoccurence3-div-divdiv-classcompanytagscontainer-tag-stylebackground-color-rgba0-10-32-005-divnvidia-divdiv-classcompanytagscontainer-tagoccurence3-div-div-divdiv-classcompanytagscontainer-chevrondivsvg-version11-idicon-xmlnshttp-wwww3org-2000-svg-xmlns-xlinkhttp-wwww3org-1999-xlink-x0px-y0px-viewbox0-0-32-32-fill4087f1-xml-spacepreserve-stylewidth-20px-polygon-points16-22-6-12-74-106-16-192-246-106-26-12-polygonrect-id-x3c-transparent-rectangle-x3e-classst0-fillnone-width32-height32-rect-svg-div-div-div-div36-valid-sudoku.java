class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String>hashRow=new HashSet<>();
        // HashSet<String>hashCol=new HashSet<>();
        // HashSet<String>hashCube=new HashSet<>();
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    String row=board[i][j]+" row "+i;
                    String col=board[i][j]+" col "+j;
                    String cube=board[i][j]+" square "+i/3+" "+j/3;
                    if(hashRow.contains(row)||hashRow.contains(col)||hashRow.contains(cube)){
                        return false;
                    }
                    else{
                        hashRow.add(row);
                        hashRow.add(col);
                        hashRow.add(cube);
                    }
                }
            }
        }
        return true;
        
        
    }
}