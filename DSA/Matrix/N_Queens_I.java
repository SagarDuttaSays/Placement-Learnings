
class N_Queens_I {
    public void storeBoard(List<List<String>> allBoards, char[][] board){
        List<String> list = new ArrayList<>();
        for(int i = 0; i<board.length; i++){
            String str = "";
            for( int j = 0; j<board.length; j++){
                if(board[i][j]=='Q')
                    str = str + 'Q';
                else 
                    str = str + '.';
            }
            list.add(str);
        }
        allBoards.add(list);
    }
    public boolean isSafe(int row, int col, char[][] board){
        //horizontal
        for(int c = 0; c<board.length; c++)
            if(board[row][c]=='Q')
                return false;
        //vertical
        for(int r = 0; r<board[0].length; r++)
            if(board[r][col]=='Q')
                return false;
        //diagonal left upper
        for(int r = row, c = col; r>=0 && c>=0; r--, c--)
            if(board[r][c]=='Q')
                return false;
        //diagonal left lower
        for(int r = row, c = col; r<board.length && c>=0; r++, c--)
            if(board[r][c]=='Q')
                return false;
        //diagonal right upper
        for(int r = row, c = col; r>=0 && c<board.length; r--, c++)
            if(board[r][c]=='Q')
                return false;
        //diagonal right lower
        for(int r = row, c = col; r<board.length && c<board.length; r++, c++)
            if(board[r][c]=='Q')
                return false;
        return true;
    }
    public void helper(List<List<String>> allBoards, char [][] board, int col){
        if(col==board.length){
            storeBoard(allBoards, board);
            return;
        }
        for(int row = 0; row<board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(allBoards, board, col+1);
                board[row][col] = '.';
                }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char [][] board = new char [n][n];
        helper(allBoards, board, 0);
        return allBoards;
    }
}