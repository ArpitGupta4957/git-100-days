public class git_24 {
    public int solveNQueens(int n) {

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        return placeQueens(board, 0);
    }

    public int placeQueens(char[][] board, int row) {

        if (row == board.length) {
            return 1;
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                count += placeQueens(board, row + 1);
                board[row][col] = '.';
            }
        }

        return count;
    }

    public boolean isSafe(char[][] board, int row, int col) {
        // Check vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //diagonal right up check
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        git_24 g = new git_24();
        System.out.println(g.solveNQueens(4));
    }
}
           