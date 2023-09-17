class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> rows = new HashSet<>();
        HashSet<String> cols = new HashSet<>();
        HashSet<String> squares = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentChar = board[i][j];
                if (currentChar != '.') {
                    String rowKey = currentChar + " in row " + i;
                    String colKey = currentChar + " in col " + j;
                    String squareKey = currentChar + " in square " + i / 3 + "-" + j / 3;
                    
                    if (!rows.add(rowKey) || !cols.add(colKey) || !squares.add(squareKey)) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}
