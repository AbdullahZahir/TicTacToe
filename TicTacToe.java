public class TicTacToe
{
    // Declare instance variables
    private String[][] board;
    private int turn;
    
    // Constructor that initializes the empty game board
    public TicTacToe()
    {
        turn = 0;
        board = new String[3][3];
        
        for (int row = 0; row<board.length; row++){
            for (int col = 0; col<board[row].length; col++) {
                board[row][col] = "-";
            }
        }




    }
    
    // Returns true if row and col is a valid, empty space
    public boolean pickLocation(int row, int col)
    {
        if (row >= 3 || col >= 3  || row < 0 || col < 0) {
            return false;
        }
        else if ("-".equals(board[row][col])) {
            return true;
        }
        else {
            return false;
        }




    }

    // Places an X or O at location (row, col) based on the turn value
    public void takeTurn(int row, int col)
    {
        if (turn%2==0) {
            board[row][col] = "X";
            turn++;
        }
        else {
            board[row][col] = "O";
            turn++;
        }



        
    }
    
    // Returns the current turn
    public int getTurn()
    {
        return turn;


    }

    // Returns true if a single row has three X or O's
    public boolean checkRow()
    {
        for (int row = 0; row<board.length; row++) {
            if (board[row][0].equals("X") && board[row][1].equals("X") && board[row][2].equals("X") || board[row][0].equals("O") && board[row][1].equals("O") && board[row][2].equals("O")){
                return true;
            }
            
        }



        return false;
    }
    
    // Returns true if a single column has three X or O's
    public boolean checkCol()
    {
        for (int col = 0; col<board[0].length; col++) {
            if ((board[0][col].equals("X")) && (board[1][col].equals("X")) && (board[2][col].equals("X")) || (board[0][col].equals("O")) && (board[1][col].equals("O")) && (board[2][col].equals("O"))){
                return true;
            }
            }
            return false;
        }



        
    

    // Returns true if a diagonal has three X or O's
    public boolean checkDiag()
    {
        if ((board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")) || (board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")) || (board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")) || (board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O"))) {
            return true;
        }
        return false;



        
    }

    // Returns true if the turn count is less than the max (9)
    public boolean checkTurn()
    {
        if (turn < 9) {
            return true;
        }

    return false;
    }
    
    // Returns true if someone has won the game
    public boolean checkWin()
    {
        if (checkRow() || checkCol() || checkDiag()) {
            return true;
        }

    return false;
    }

    // Prints out the board array on to the console
    public void printBoard()
    {
      System.out.println("  0 1 2");
      for (int row = 0; row < 3; row++) {
          System.out.println(row + " ");
          
          for (int col = 0; col < 3; col++) {
              System.out.println(board[row][col] + " ");
          }
      }

      System.out.println();


        
    }
}
