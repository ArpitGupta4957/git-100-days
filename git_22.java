import java.util.ArrayList;
import java.util.List;

public class git_22 {
    public static List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        queen(board, ans, 0);
        
        return ans;
    }
    public static void queen(char [][] board, List<List<String>> list, int row){
        if(board.length==row){
            list.add(construct(board));
            return;
        }
        for(int col=0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                queen(board, list, row+1);
                board[row][col] ='.';
            }
        }
    }
    public static List<String> construct(char[][] board){
        List<String> internal = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String row = new String(board[i]);
            internal.add(row);
        }
        return internal;
    }
    static boolean isSafe(char [][] board, int row, int col){
        //vertical up check
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q') return false;
        }
        //diagonal left up check
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        //diagonal right up check
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        //we can't check horizontal left and right bcoz we can't put queen on same row
        return true;
    }
    
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = solveNQueens(n);
        System.out.println(ans);
    }
}
