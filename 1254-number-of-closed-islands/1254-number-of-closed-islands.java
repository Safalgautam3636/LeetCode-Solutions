class Solution {
    public int closedIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        int ans = 0;
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 0 && !visited[i][j] && dfs(grid, row, col, i, j, visited)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public boolean dfs(int[][] grid, int row, int col, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= row || j >= col) {
            return false;
        }
        if (grid[i][j] == 1 || visited[i][j]) {
            return true;
        }
        visited[i][j] = true;
        boolean up = dfs(grid, row, col, i-1, j, visited);
        boolean down = dfs(grid, row, col, i+1, j, visited);
        boolean left = dfs(grid, row, col, i, j-1, visited);
        boolean right = dfs(grid, row, col, i, j+1, visited);
        return up && down && left && right;
    }
}
