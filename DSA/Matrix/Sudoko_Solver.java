class Sudoko_Solver{
    public boolean isSafe(char[][] board, int row, int col, char k) {
        // Horizontal
        for (int c = 0; c < board[row].length; c++)
            if (board[row][c] == k)
                return false;
        
        // Vertical
        for (int r = 0; r < board.length; r++)
            if (board[r][col] == k)
                return false;
        
        // Within the box (size = n x n)
        int boxRowStart = 3 * (row / 3);
        int boxColStart = 3 * (col / 3);
        for (int r = boxRowStart; r < boxRowStart + 3; r++)
            for (int c = boxColStart; c < boxColStart + 3; c++)
                if (board[r][c] == k)
                    return false;
        
        return true;        
    }
    
    private boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isSafe(board, i, j, c)) {
                            board[i][j] = c;
                            if (solve(board))
                                return true;
                            else
                                board[i][j] = '.'; // backtrack
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    public void solveSudoku(char[][] board) {
       if (board == null || board.length == 0)
            return;
        solve(board);
    }
}
