package rocks.zipcode.io.assessment4.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] ans = new String[3];
        for (int i = 0; i <ans.length ; i++) {
            ans[i] = board[value][i];
        }

        return ans;
    }

    public String[] getColumn(Integer value) {
        String[] ans = new String[3];
        for (int i = 0; i <ans.length ; i++) {
            ans[i] = board[i][value];
        }

        return ans;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
      String[] checkedOver = getRow(rowIndex);
      if(checkedOver[0].equals(checkedOver[1]) && checkedOver[0].equals(checkedOver[2])){
          return true;
      }
      return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
       String[] checkedOver = getColumn(columnIndex);
        if(checkedOver[0].equals(checkedOver[1]) && checkedOver[0].equals(checkedOver[2])){
            return true;
        }
        return false;
    }

    public String getWinner() {
        if(isColumnHomogeneous(0) || isRowHomogenous(0)){
            return board[0][0];
        }
        if(isColumnHomogeneous(1) || isRowHomogenous(1)){
            return board[0][1];
        }
        if(isDigleftrightHomogeneous() || isDigRightLeftHomogeneous()){
            return board[1][1];
        }


        return null;
    }

    public String[][] getBoard() {
        return board;
    }

    public Boolean isDigleftrightHomogeneous() {
        return board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]);
    }

    public Boolean isDigRightLeftHomogeneous() {
        return board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]);
    }

}
